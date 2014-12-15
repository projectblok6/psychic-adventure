package domain.businessrule;

import java.util.ArrayList;

import domain.Template;


public class RangeRule implements BusinessRule{
	private String ruleName;
	private ArrayList<String> triggerEvents;
	private String operator;
	private String errorMessage;
	
	
	public RangeRule(){
		
	}
}
