package pobj.expr;

public class Mult extends BinOp implements Expression{

	public Mult(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getLeft().toString()+" * "+super.getRight().toString();
	}

	@Override
	public int eval() throws UnsupportedOperationException{
		// TODO Auto-generated method stub
		if(this.getLeft() instanceof Var) throw new UnsupportedOperationException();
		if(this.getRight() instanceof Var) throw new UnsupportedOperationException();
		return this.getLeft().eval()*this.getRight().eval();
	}
	
	
	@Override
	public <T> T accept(IVisitor<T> iv) {
		// TODO Auto-generated method stub
		return iv.visit(this);
	}
}
