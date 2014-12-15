import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import domain.Component;
import domain.Operator;
import domain.Value;
import domain.businessrule.BusinessRule;
import domain.businessrule.RangeRule;


public class test {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Creating the objects that would be created by the DAO (Data Access Object)
		ArrayList<String> triggerEvents = new ArrayList<String>();
		triggerEvents.add("UPD");
		triggerEvents.add("INS");
		
		ArrayList<Component> components = new ArrayList<Component>();
		components.add(new Value("value1"));
		components.add(new Value("value2"));
		components.add(new Value("value3"));
		
		Operator operator = new Operator("Not Between", "not between");
		
		BusinessRule test1 = new RangeRule(triggerEvents, "fout in de code", components, operator);
		Scanner sc = new Scanner(new FileReader("src/triggertemplate.txt"));
		String triggerString = "";
		while (sc.hasNext()) {
			String line = sc.nextLine();
			triggerString += line + "\n";
		}
		triggerString = triggerString.replaceAll("%businessrules%", test1.getGeneratedRule());
		System.out.println(triggerString);
		

	}

}
