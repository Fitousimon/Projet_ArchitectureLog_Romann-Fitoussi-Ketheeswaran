package actions;

import introspection.ClasseInspecteur;
import types.Type;

public class Describe {
	
	private String [] parents;
	private String interfaces;
	private String [] methodeNoms;
	private String [] methodeTypes;
	private String [] varNoms;
	private String [] varTypes;
	private String classOrInterface;
	public String[] getParents() {
		return parents;
	}
	public void setParents(String[] parents) {
		this.parents = parents;
	}
	public String getInterfaces() {
		return interfaces;
	}
	public void setInterfaces(String interfaces) {
		this.interfaces = interfaces;
	}
	public String[] getMethodeNoms() {
		return methodeNoms;
	}
	public void setMethodeNoms(String[] methodeNoms) {
		this.methodeNoms = methodeNoms;
	}
	public String[] getMethodeTypes() {
		return methodeTypes;
	}
	public void setMethodeTypes(String[] methodeTypes) {
		this.methodeTypes = methodeTypes;
	}
	public String[] getVarNoms() {
		return varNoms;
	}
	public void setVarNoms(String[] varNoms) {
		this.varNoms = varNoms;
	}
	public String[] getVarTypes() {
		return varTypes;
	}
	public void setVarTypes(String[] varTypes) {
		this.varTypes = varTypes;
	}
	public Describe(String[] parents, String interfaces, String[] methodeNoms, String[] methodeTypes, String[] varNoms,
			String[] varTypes, String classOrInterface) {
		super();
		this.parents = parents;
		this.interfaces = interfaces;
		this.methodeNoms = methodeNoms;
		this.methodeTypes = methodeTypes;
		this.varNoms = varNoms;
		this.varTypes = varTypes;
		this.classOrInterface = classOrInterface;
	}
	
	public Describe(String nomClasse){
		ClasseInspecteur ciType = new ClasseInspecteur(nomClasse);
		this.classOrInterface = ciType.what(nomClasse);
		this.parents = ciType.getClasseParentes(nomClasse);
		this.interfaces =  ciType.getInterface(nomClasse);
		this.methodeNoms = ciType.getMethodesNom(nomClasse);
		this.methodeTypes = ciType.getMethodesType(nomClasse);
		this.varNoms = ciType.getChampsNom(nomClasse);
		this.varTypes = ciType.getChampsType(nomClasse);
	}
	
	public String methodes(){
		String [] nom = this.getMethodeNoms();
		String [] type = this.getMethodeTypes();
		String res = "";
		for (int i = 0; i<nom.length; i++){
			res = res + nom[i] + " - " + type[i] + "\n";
		}
		if (res=="") {res = "Pas de méthode \n";}
		return res;
		
	}
	
	public String var(){
		String [] nom = this.getVarNoms();
		String [] type = this.getVarTypes();
		String res = "";
		for (int i = 0; i<nom.length; i++){
			res = res + nom[i] + " - " + type[i] + "\n";
		}
		if (res=="") {res = "Pas de variable \n";}
		return res;
		
	}
	
	public String toString () {
		String res = "";
		res += "TYPE : "+"\n" + this.classOrInterface +"\n";
		res = res + "CLASSES PARENTES:" + "\n" + java.util.Arrays.toString(this.parents) + "\n";
		res = res + "CLASSES IMPLEMENTES:" + "\n" + this.interfaces + "\n";
		res = res + "VARIABLES  :" + "\n" + this.var();
		res = res + "METHODES  :" + "\n" + this.methodes() + "\n";
		return res;
		
	}
	
	public static void main(String[] args) {
		System.out.println("INTROSPECTION" + "\n");
		String nomClasseType = "types.Type";
		System.out.println("NOM : " +nomClasseType);
		Describe descr = new Describe(nomClasseType);
		System.out.println(descr.toString());
		
		String nomClasseClasse = "types.Classe";
		System.out.println("NOM : " +nomClasseClasse);
		Describe descr1 = new Describe(nomClasseClasse);
		System.out.println(descr1.toString());
		
		String nomClasseInterface = "types.Interface";
		System.out.println("NOM : " +nomClasseInterface);
		Describe descr2 = new Describe(nomClasseInterface);
		System.out.println(descr2.toString());
		
		String nomClasseIType = "types.IType";
		System.out.println("NOM : " +nomClasseIType);
		Describe descr3 = new Describe(nomClasseIType);
		System.out.println(descr3.toString());
		
	}
	
}