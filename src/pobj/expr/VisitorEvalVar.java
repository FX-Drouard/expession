package pobj.expr;

import java.util.Map;

public class VisitorEvalVar extends VisitorEval{
	private Map<String,Integer> e;
	public VisitorEvalVar(Map<String,Integer> map) {
		this.e=map;
	}
	@Override
	public Integer visit(Var v){
		// TODO Auto-generated method stub
		if (e.containsKey(v.getName())) {
			return e.get(v.getName());
		}else {
			throw new RuntimeException("Pas trouvé!");
		}
	}
}
