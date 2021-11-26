package pobj.expr;

public class VisitorDerive implements IVisitor<Expression> {
	private Var v;
	
	public VisitorDerive(Var v) {
		this.v=v;
	}

	@Override
	public Expression visit(Constant c) {
		// TODO Auto-generated method stub
		return new Constant(0);
	}

	@Override
	public Expression visit(Add e) {
		// TODO Auto-generated method stub
		return new Add(e.getLeft().accept(this),e.getRight().accept(this));
	}

	@Override
	public Expression visit(Mult e) {
		// TODO Auto-generated method stub
		return new Add(new Mult(e.getLeft(),e.getRight().accept(this)),new Mult(e.getLeft().accept(this),e.getRight()));
	}

	@Override
	public Expression visit(Var v) {
		// TODO Auto-generated method stub
		if(v.getName().equals(this.v.getName())) return new Constant(1);
		return new Constant(0);
	}

}
