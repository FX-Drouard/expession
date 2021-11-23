package pobj.expr;

public class Question10 {
	public static boolean isConstant(Expression e) {
		if ((e instanceof Add )|| (e instanceof Mult )) {
			BinOp es=(BinOp) e;
			return (isConstant(es.getLeft())&&isConstant(es.getLeft()));
		}else {
			if (e instanceof Var) {
				return false;
			}else {return true;}
		}
	}
	public static int evalConstantExpression(Expression e) {
		return e.accept(new VisitorEval());
	}
}
