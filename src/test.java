import java.util.ArrayList;

import domain.Component;
import domain.Operator;
import domain.Value;
import domain.businessrule.BusinessRule;
import domain.businessrule.RangeRule;


public class test {

	public static void main(String[] args) {
		ArrayList<String> triggerEvents = new ArrayList<String>();
		triggerEvents.add("UPD");
		triggerEvents.add("INS");
		
		Component component1 = new Value();
		Component component2 = new Value();
		Component component3 = new Value();
		
		
		BusinessRule test1 = new RangeRule(triggerEvents, "fout in de code", component1, component2, component3);
		test1.getGeneratedRule();
	}

}
