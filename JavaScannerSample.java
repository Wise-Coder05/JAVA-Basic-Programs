import java.util.Scanner; 
public class JavaScannerSample { 
	public static void main(String[] args) { 
	    Scanner scanner = new Scanner(System.in); 
	    String input = readInput(scanner);
	    System.out.println("User Entered:"+input); 
	} 
	public static String readInput(Scanner scanner) { 
		String input = ""; 
		StringBuilder sb = new StringBuilder(); 
		System.out.println("Enter String:"); 
		while ((input = scanner.nextLine()).length() > 0 ) { 
			System.out.println("Enter String: "); 
sb.append(input); 
		}
		return sb.toString(); 
	} 
} 
