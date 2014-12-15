package domain;

public class Operator {
	private String operatorName;
	private String logicalOperator;
	
	public Operator(String nM, String lO){
		this.operatorName = nM;
		this.logicalOperator = lO;
	}
	
	public Operator getOperator(){
		return this;
	}
	
	public String getName(){
		return operatorName;
	}
	
	public String getLogicalOperator(){
		return logicalOperator;
	}
}
