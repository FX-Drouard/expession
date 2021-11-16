package pobj.expr;

public class Var implements Expression {
	private final String nom;
	public Var(String nom) {
		this.nom=nom;
	}
	
	public String getName() {return nom;}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(!(o instanceof Var)) return false;
		Var tmp= (Var) o;
		return tmp.getName().equals(this.nom);
	}
	
	public String toString() {
		return this.getName();
	}

	@Override
	public int eval() throws UnsupportedOperationException{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T accept(IVisitor<T> iv) {
		// TODO Auto-generated method stub
		return iv.visit(this);
	}
}
