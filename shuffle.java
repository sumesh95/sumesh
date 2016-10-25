import java.util.Scanner;

import java.util.*;
import java.io.*;

public class Sum
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String s=sc.next();
		 char[] str=s.toCharArray();
		 int a=1;
		 for(int i=0;i<str.length-1;i++)
		 {
		   for(int j=i+1;j<str.length;j++)
		     if(str[i]!=str[j])
		     {
		       char c=str[i+1];
		       str[i+1]=str[j];
		       str[j]=c;
		     }
		 }
		 for(int i=0;i<str.length-1;i++)
		   if(str[i]==str[i+1])
		   {
		        a=0;
		        break;
		   }
		 if(a==0)
		System.out.println("not valid");
		 else
			 System.out.println("valid");
	}
	
}
	
	

