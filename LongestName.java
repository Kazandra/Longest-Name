import java.util.*;

public class LongestName {

	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("How many names do you want to enter?: ");
		int amount = console.nextInt();
	//}
	//public static void LongestMethod(Scanner console, int amount) {	
		String longest = "";
		for (int i = 1; i <= amount; i++){
			System.out.println("Name #" + i + ":");
			String name = console.next();
			System.out.println(name);
			if (name.length() > longest.length()){
				longest = name;
				
			}
		}System.out.println("The longest name is: " + longest);
		console.close();
		}
	}
		

	
		
	

	


