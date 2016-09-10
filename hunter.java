package pro;

import java.util.Scanner;

public class Hunter3 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int li=scan.nextInt();
		int num[]=new int[li],i;
		for(i=0;i<li;i++)
		{
			num[i]=scan.nextInt();
			
		}
				
		for(i=0;i<li;i++)
		{
			if(i==num[i]){
				System.out.println(num[i]);
			}
		}
	}

}
