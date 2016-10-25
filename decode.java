import java.util.Scanner;

import java.util.*;
import java.io.*;

public class Sum
{
	public static void main(String[] args) {
		String s,s1;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
       int n=s.length();
        char arr;
       char c[]=s.toCharArray();
        for(int i=0;i<n;i++){
             arr=(char) (c[i]-1);  
            
             if((c[i]-1)=='`' || (c[i]-1)=='`'){
                 arr=(char) (c[i]+25);}
               System.out.print(arr);
                
}
	        }
	}

	

