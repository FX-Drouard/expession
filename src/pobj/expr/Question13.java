package pobj.expr;

public class Question13 {
	public static <T> T compose(IVisitor<T> f, IVisitor<Expression> g, Expression e) {
		Expression tmp= e.accept(g);
		Expression res= (Expression) tmp.accept(f);
		return (T) res;
	}
}
