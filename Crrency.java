import java.util.Arrays;
import java.util.Scanner;

public class Assignment3{
	static int a,b, c, d, e, f, g, h;
public static void main(String[] args){
	
	 int rs,count=1; 
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the amount in Rupees : ") ; 
	 rs=scan.nextInt(); 
	 while(rs >= 500) 
	 { 
	  a = rs / 500 ; 
	  rs = rs % 500;
	  System.out.println("500:"+a) ; 

	  break ; 
	 } 
	 while(rs >= 100) 
	 { 
	  b = rs / 100 ; 
	  rs = rs % 100;
	  System.out.println("100:"+b); 
	  
	  break ; 
	 } 
	 while(rs >= 50) 
	 { 
	  c = rs / 50 ;
	  rs = rs % 50; 
	  System.out.println("50:"+c); 
	 
	  break ; 
	 } 
	 while(rs >= 20) 
	 { 
	  d = rs / 20 ; 
	  rs = rs % 20;
	  System.out.println("20:"+d);
	  
	  break ; 
	 } 
	 while(rs >= 10) 
	 { 
	  e = rs / 10 ; 
	  rs = rs % 10;
	  System.out.println("10:"+e);
	  
	  break ; 
	 } 
	 while(rs >= 5) 
	 { 
	  f = rs / 5 ; 
	  rs = rs % 5;
	  System.out.println("5:"+f); 
	  
	  break ; 
	 } 
	 while(rs >= 2) 
	 { 
	  g = rs / 2 ; 
	  rs = rs % 2;
	  
	  System.out.println("2:"+g);
	  
	  break ; 
	 } 
	 while(rs >= 1) 
	 { 
	  h = rs / 1 ; 
	  rs = rs % 1;
	  System.out.println("1:"+h); 
	  
	  break ; 
	 }
	 count= a+b+c+d+e+g+h;
	  System.out.println("total currency "+count);
	
             
}
	
}
	
	


