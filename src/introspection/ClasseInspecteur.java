package introspection;
import java.util.*;
import java.lang.reflect.*;

public class ClasseInspecteur {
	private Class classe;
	private String nomClasse;

	public ClasseInspecteur(String nomClasse) {
		this.nomClasse = nomClasse;
		try {
			classe = Class.forName(nomClasse);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Class getClasse() {
		return classe;
	}

	public void setClasse(Class classe) {
		this.classe = classe;
	}

	public String getNomClasse() {
		return nomClasse;
	}

	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}

	public Vector getClassesParentes() {
		Vector cp = new Vector();
		Class sousClasse = classe;
		Class superClasse;

		cp.add(sousClasse.getName());
		superClasse = sousClasse.getSuperclass();
		while (superClasse != null) {
			cp.add(0, superClasse.getName());
			sousClasse = superClasse;
			superClasse = sousClasse.getSuperclass();
		}
		return cp;
	}

	public Vector getInterfaces() {
		Vector cp = new Vector();

		Class[] interfaces = classe.getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			cp.add(interfaces[i].getName());
		}
		return cp;
	}

	private String formatParametre(String s) {

		if (s.charAt(0) == '[') {

			StringBuffer param = new StringBuffer("");
			int dimension = 0;
			while (s.charAt(dimension) == '[')
				dimension++;
			switch (s.charAt(dimension)) {
			case 'B':
				param.append("byte");
				break;
			case 'C':
				param.append("char");
				break;
			case 'D':
				param.append("double");
				break;
			case 'F':
				param.append("float");
				break;
			case 'I':
				param.append("int");
				break;
			case 'J':
				param.append("long");
				break;
			case 'S':
				param.append("short");
				break;
			case 'Z':
				param.append("boolean");
				break;
			case 'L':
				param.append(s.substring(dimension + 1, s.indexOf(";")));
			}

			for (int i = 0; i < dimension; i++)
				param.append("[]");

			return param.toString();
		} else
			return s;}

	private String rechercheParametres(Class[] classes) {
		StringBuffer param = new StringBuffer("(");

		for (int i = 0; i < classes.length; i++) {
			param.append(formatParametre(classes[i].getName()));
			if (i < classes.length - 1)
				param.append(", ");
		}
		param.append(")");

		return param.toString();
	}

	public List getSignatureMethodes() {

		List cp = new ArrayList();
		Method[] methodes = classe.getDeclaredMethods();
		for (int i = 0; i < methodes.length; i++) {
			StringBuffer methode = new StringBuffer();

			methode.append(formatParametre(methodes[i].getReturnType().getName()));
			methode.append(" ");
			methode.append(methodes[i].getName());
			methode.append(rechercheParametres(methodes[i].getParameterTypes()));

			cp.add(methode.toString());
		}
		return cp;
	}

	public Vector getChamps() {
		Vector cp = new Vector();

		Field[] champs = classe.getDeclaredFields();
		for (int i = 0; i < champs.length; i++)
			cp.add(champs[i].getType().getName() + " " + champs[i].getName());
		return cp;
	}
	
	public String[] getChampsNom(String nomClasse){
		ClasseInspecteur c = new ClasseInspecteur(nomClasse);
		Vector v = c.getChamps();
		String [] res = new String [v.size()];
		
		for (int i = 0; i<v.size() ; i++){
			String s = (String) v.get(i);
			String[] parts = s.split(" ");
			res[i] = parts[0];
		}
		return res;
	}
	
	public String[] getChampsType(String nomClasse){
		ClasseInspecteur c = new ClasseInspecteur(nomClasse);
		Vector v = c.getChamps();
		String [] res = new String [v.size()];
		for (int i = 0; i<v.size() ; i++){
			String s = (String) v.get(i);
			String[] parts = s.split(" ");
			res[i] = parts[1];
		}
		return res;
	}
	
	public String[] getMethodesType(String nomClasse){
		ClasseInspecteur c = new ClasseInspecteur(nomClasse);
		List v = c.getSignatureMethodes();
		String [] res = new String [v.size()];
		for (int i = 0; i<v.size() ; i++){
			String s = (String) v.get(i);
			String[] parts = s.split(" ");
			res[i] = parts[0];
		}
		return res;
	}
	
	public String[] getMethodesNom(String nomClasse){
		ClasseInspecteur c = new ClasseInspecteur(nomClasse);
		List v = c.getSignatureMethodes();
		String [] res = new String [v.size()];
		for (int i = 0; i<v.size() ; i++){
			String s = (String) v.get(i);
			String[] parts = s.split(" ");
			res[i] = parts[1];
		}
		return res;
	}
	
	public String getInterface(String nomClasse){
		ClasseInspecteur c = new ClasseInspecteur(nomClasse);
		Vector v = c.getInterfaces();
		if (v.size()!=0){return (String)v.get(0);} else {return "Pas d'interface implémentées";}
		
	}

	public String[] getClasseParentes(String nomClasse){
		ClasseInspecteur c = new ClasseInspecteur(nomClasse);
		Vector v = c.getClassesParentes();
		String [] res = new String [v.size()];
		for (int i=0; i<v.size();i++){
			res[i] = (String) v.get(i);
		}
		return res;
	}
	
	public String what(String classeNom){
		ClasseInspecteur ci = new ClasseInspecteur(classeNom);
		Class c = ci.getClasse();
		if (c.isInterface()) { return "Interface";} else {return "Classe";} 
	}
	
	public static void main(java.lang.String[] args) {
		ClasseInspecteur ci = new ClasseInspecteur("types.Type");
		Vector v = ci.getClassesParentes();
		Vector v1 = ci.getInterfaces();
		System.out.println("taille de classe parente" + v.size());
		System.out.println(v.get(0) + " -" + v.get(1) +" -" + v.get(2) );
		System.out.println("taille de classe implementés" + v1.size());
		//System.out.println(v1.get(0));
		List v2 = ci.getSignatureMethodes();
		System.out.println("taille de methodes" + v2.size());
		System.out.println(v2.get(0) + " -" + v2.get(1) + " - " + v2.get(2));
		Vector v3 = ci.getChamps();
		System.out.println("taille de variable" + v3.size());
		System.out.println(v3.get(0) + " - " + v3.get(1) + " - " + v3.get(2));
		String [] m = ci.getChampsNom("types.Type");
		System.out.println(java.util.Arrays.toString(m));
	}

}