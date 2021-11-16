package pobj.expr;

public class Constant implements Expression {
	private int value;
	
	public Constant(int value) {
		this.value=value;
	}
	
	public Constant() {
		this.value=0;
	}
	
	public int getValue() {
		return value;
	}
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(!(o instanceof Constant)) return false;
		Constant tmp= (Constant) o;
		return tmp.getValue()==this.value;
	}
	
	public String toString() {
		String res="";
		res+=value;
		return res;
	}
	
	@Override
	public int eval() {
		return value;
	}
	
	@Override
	public <T> T accept(IVisitor<T> iv) {
		// TODO Auto-generated method stub
		return iv.visit(this);
	}
	
	
	
}
