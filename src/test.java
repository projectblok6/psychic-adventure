import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		FileReader file = null;
		try {
			file = new FileReader("src/plsqltemplate.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(file);
		Scanner lineScanner = new Scanner(br);
		System.out.println(lineScanner.findInLine("%rulname%"));
	}

}
