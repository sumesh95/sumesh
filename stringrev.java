import java.util.Scanner;

public class Prime {
	

	public static void main(String args[])
	 {
	  Scanner sc=new Scanner(System.in);
	  String s,temp="";
	  s=sc.nextLine();
	  for(int i=s.length()-1;i>=0;i--){
		  if(s==" ")
			  System.out.println(s);
		   temp=temp+s.charAt(i);
	  }
	  System.out.println(temp);
}
}
