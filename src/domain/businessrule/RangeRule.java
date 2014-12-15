package domain.businessrule;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import domain.Component;
import domain.Operator;


public class RangeRule implements BusinessRule{
	private String ruleName;
	private ArrayList<String> triggerEvents;
	private Operator operator;
	private Component component1;
	private Component component2;
	private Component component3;
	private String errorMessage;
	
	
	public RangeRule(ArrayList<String> triggerEvents, String errorMessage, Component component1, Component component2, Component component3){
		this.triggerEvents = triggerEvents;
		this.errorMessage = errorMessage;
		this.component1 = component1;
		this.component2 = component2;
		this.component3 = component3;
	}
	
	public String getGeneratedRule(){
		File file = new File("src/ruletemplate.txt");
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(bf);
		String ruleString = "";
		while(sc.hasNext()){
			String line = sc.nextLine();
			ruleString += line + "\n";
		}
		String triggerLine;
		for(String triggerEvent : triggerEvents){
			
		}
		ruleString = ruleString.replaceAll("%errormessage%", errorMessage);
		
		System.out.println(ruleString);
		return null;	
	}
}
