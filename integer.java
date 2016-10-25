import java.util.Arrays;
import java.util.Scanner;

public class Assignment3{
	
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int n;
	System.out.println("enter the range");
n=scan.nextInt();
int[] m=new int[n];
System.out.println("enter the numbers");
for(int i=0;i<n;i++){
	m[i]=scan.nextInt();
}
for(int i=0;i<n-1;i++){
	if(m[i] > m[i+1]){
		System.out.println(m[i+1]);
	}
		else{
			System.out.println("-1");
			
		}
			
	}
}

             
}
	

	
	


