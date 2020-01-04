	
		import java.util.Scanner;
		public class palindrom
{
	public static void main(String[] args) {
	    
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in); 
		String s = sc.nextLine();
		StringBuilder s1 = new StringBuilder();
		s1.append(s);
		s1 = s1.reverse();
		if(s.equals(s1.toString()))
		{
		    System.out.println("String is Palindrom");
		}
		else
		{
		    System.out.println("String is not palindrom");
		}
}
}

