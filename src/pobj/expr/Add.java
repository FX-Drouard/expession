package pobj.expr;

public class Add extends BinOp implements Expression {

	public Add(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "( "+super.getLeft().toString()+" + "+super.getRight().toString()+" )";
	}
	
	public int eval() throws UnsupportedOperationException{
		// TODO Auto-generated method stub
		return this.getLeft().eval()+this.getRight().eval();
	}
	
	@Override
	public <T> T accept(IVisitor<T> iv) {
		// TODO Auto-generated method stub
		return iv.visit(this);
	}
	
}
