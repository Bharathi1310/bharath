# bharath
import java.util.Scanner;


public class Alphabet {

	public static void main(String[] args) {
    char ch;
    Scanner str=new Scanner(System.in);
    System.out.println("enter the character:");
    ch=str.next().charAt(0);
    //System.out.println("enter the character:");
    if((ch>'A'&&ch<'Z')||(ch>'a'&&ch<'z'))
    {
    	System.out.println("given character is alphabet");
    }else
    {
    	System.out.println("given character is not alphabet");
    }

	}

}
