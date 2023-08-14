import java.util.*;
public class WordCount {
    public static void main(String[] args) {
	    //Asking the user to enter a string 
		System.out.println("\n\nEnter any string...");
		Scanner sc=new Scanner(System.in);
		//Taking input string from the user 
		String s=sc.nextLine();
		int i,count=1;
		char a,b;
		int l=s.length();
		for(i=0;i<(l-1);i++)
		{
		    a=s.charAt(i);
		    b=s.charAt(i+1);
		    if(a==' ' && b!=' ')
		    {
		        count++;   //Increment the count value 
		    }
		}
		System.out.println("\nTHE NUMBER OF WORDS IN THE GIVEN STRING IS.. "+count+"\n");
	}
}
