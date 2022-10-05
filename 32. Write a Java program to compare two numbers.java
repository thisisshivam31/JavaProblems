import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner SC = new Scanner(System.in);
	    int a = SC.nextInt();
	    int b = SC.nextInt();
	    
	    if(a!=b){
	        System.out.println(a+" != "+b);
	    }
	    if(a<b){
	        System.out.println(a+" < "+b);
	    }
	    if(a<=b){
	        System.out.println(a+" <= "+b);
	    }
	    
	}
}
