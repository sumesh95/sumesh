import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Helo {
public static void main(String[] args){
	System.out.println("enter the range");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
float[] a=new float[n];
System.out.println("enter the numbers");
for(int i=0;i<n;i++){
	a[i]=scan.nextFloat();
}
for(int i=0;i<n;i++){
	for(int j=i;j<n;j++){
		if(a[i]<a[j]){
			float temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
		for(int j=0;j<n;j++){
			System.out.println(a[j]);
		}
	}

}



		
