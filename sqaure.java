import java.util.Scanner;

public class Prime {
	

	public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
	        int[] a=new int[8];
	        System.out.println("enter the points");
	        
	        for(int j=0;j<a.length;j++)
	        {
	            a[j]=sc.nextInt();
	        }
	        if(a[0]==a[2]&&a[4]==a[6]&&a[1]==a[7]&&a[3]==a[5])
	        {
	            System.out.println("square");}
	            else{
	            	System.out.println("not a square");
	            }
	}
}
