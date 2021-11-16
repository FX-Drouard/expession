package pobj.expr;

public class Question4 {
	public static Expression e1() {
		Mult a=new Mult(new Add(new Constant(2),new Constant(3)),new Constant(4));
		return (Expression)a;
	}
	public static Expression e2() {
		Mult b=new Mult(new Add(new Var("x"),new Constant(3)),new Add(new Var("x"),new Constant(4)));
		return (Expression)b;
	}
	public static Expression e3() {
		Mult c=new Mult(new Add(new Var("x"),new Constant(10)),new Add(new Var("y"),new Constant(-8)));
		return (Expression)c;
	}
}
