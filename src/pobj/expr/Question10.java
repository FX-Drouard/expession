package pobj.expr;

public class Question10 {
	public static boolean isConstant(Expression e) {
		/*if ((e instanceof Add )|| (e instanceof Mult )) {
			BinOp es=(BinOp) e;
			return (isConstant(es.getLeft())&&isConstant(es.getLeft()));
		}else {
			if (e instanceof Var) {
				return false;
			}else {return true;}
		}*/
		return e.accept(new VisitorConstant()); 
	}
	public static int evalConstantExpression(Expression e) throws RuntimeException {
		if(!isConstant(e)) throw new RuntimeException();
		return e.accept(new VisitorEval());
	}
}
