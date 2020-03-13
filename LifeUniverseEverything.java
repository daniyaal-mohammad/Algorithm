import java.util.*;
//import java.lang.*;
 
public class Main
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		for(int i=0;;i++){
			int a = scan.nextInt();
			if(a==42)
		 		return;
			else
				System.out.println(a);
		}
	}
} 
