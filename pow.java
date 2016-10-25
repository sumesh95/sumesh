import java.util.Scanner;

import java.util.*;
import java.io.*;

public class Sum
{
	public static void main(String[] args) {
		int number;
		int remainder;
		int[] arr=new int[30];
		int n=0;
		int output=0;
		Scanner in=new  Scanner(System.in);
		System.out.println("enter the number");
		number=in.nextInt();
		while(number!=0)
		{
			remainder=number%10;
			arr[n]=remainder;
			n++;
			number=number/10;
		}/*for(int k=0;k<n;k++)
		{
			System.out.println(array[k]);
		}*/
		for(int i=n-1;i>=0;i--)
		{
			if(i==0)
			{
				output=(int)(output+Math.pow(arr[i],0));
			}
			else
			{
			output=(int)(output+Math.pow(arr[i], arr[i-1]));
			}
		}
System.out.println(output);
	
	}
}
	

