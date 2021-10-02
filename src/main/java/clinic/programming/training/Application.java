package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words){
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}
    
	public void greet(){
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		
		for (String greeting : list) {
			System.out.println("Greeting: " + greeting);
		}
	}
	
    public Application() {
		System.out.println ("Inside Application");
		
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWords("I have a lovely bunch of coconuts");
		System.out.println("Word Count: " + count);
    }
}