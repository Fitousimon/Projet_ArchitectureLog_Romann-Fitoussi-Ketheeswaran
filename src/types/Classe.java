package types;

import java.util.ArrayList;
import java.util.List;

import classe.Methode;
import classe.Variable;
import relations.IRelation;

public class Classe extends Type implements IType {

	List<Variable> listeVariable;

	public Classe() {
		super();
		listeVariable = new ArrayList<>();
		listeMethode = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	public Classe(int e, String c, List<IRelation> lr, List<Variable> lv,
			List<Methode> lm) {
		super(e, c, lr, lm);
		this.listeVariable = lv;
		// TODO Auto-generated constructor stub
	}

	public List<Variable> getListeVariable() {
		return listeVariable;
	}

	public void setListeVariable(List<Variable> listeVariable) {
		this.listeVariable = listeVariable;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
