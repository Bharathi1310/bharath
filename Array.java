import java.util.Scanner;
public class Array {
public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
    
     int n=in.nextInt();
     int a[]=new int[n];
    
     for(int i=0;i<a.length;i=i+1)
     {   a[i]=in.nextInt();
    	 
     if(a[i]==0){
    		System.out.println("false");
    		 
     }
     }
    System.out.println("true");
  }

   }
