package pobj.expr;

public class VisitorSimplify implements IVisitor<Expression> {

	@Override
	public Expression visit(Constant c) {
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public Expression visit(Add e) {
		// TODO Auto-generated method stub
		if(Question10.isConstant(e)) {
			return new Constant(Question10.evalConstantExpression(e));
		}else if(e.getLeft().eval()==0) {
			return e.getRight();
		}else if (e.getRight().eval()==0) {
			return e.getLeft();
		}
		return null;
	}

	@Override
	public Expression visit(Mult e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression visit(Var v) {
		// TODO Auto-generated method stub
		return v;
	}
	
	/*
	private Expression parcours(Add e) {
		
		if ((e.getLeft() instanceof Constant)&&(e.getRight() instanceof Constant)) {
			return new Constant(e.getLeft().eval()+e.getRight().eval());
		}else {
				if ((e.getLeft() instanceof Var)||(e.getRight() instanceof Var)) {
					return e;
				}
				return new Add(new VisitorSimplify().parcours(e.getLeft()),parcours(e.getRight()));
			}
		}
	private Expression parcours(Mult e) {
		
		if ((e.getLeft() instanceof Constant)&&(e.getRight() instanceof Constant)) {
			System.out.println("la");
			return new Constant(e.getLeft().eval()*e.getRight().eval());
		}else {
			if ((e.getLeft() instanceof Var)||(e.getRight() instanceof Var)) {
				return e;
			}
				return new Mult(new VisitorSimplify().parcours(e.getLeft()),parcours(e.getRight()));
			}
		}
	private Expression parcours(Constant e) {
		
		return e;
		}
	private Expression parcours(Var e) {
		
		return e;
		}
	private Expression parcours(Expression e) {
		
		if (e instanceof Add) {
			return parcours((Add) e);
		}else if (e instanceof Mult) {
			return parcours((Mult) e);
		}else if (e instanceof Constant) {
			return parcours((Constant) e);
		}else if (e instanceof Var) {
			return parcours((Var) e);
		}else {throw new RuntimeException("cas non gerer");}
	}*/
}

