package types;

import relations.IRelation;

public class Interface extends Type implements IType {

	@Override
	public void display() {
		for (IRelation r : this.getListeRelations()) {
			r.display();

		}
	}
}
