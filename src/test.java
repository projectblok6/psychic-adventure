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
		
		ArrayList<Component> components = new ArrayList<Component>();
		components.add(new Value("value1"));
		components.add(new Value("value2"));
		components.add(new Value("value3"));
		
		BusinessRule test1 = new RangeRule(triggerEvents, "fout in de code", components);
		test1.getGeneratedRule();
	}

}
