import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    
    int i=1;
    while(i<11){
        System.out.println(x +" X "+ i +" = "+ i);
        i++;
    }
  }
}
