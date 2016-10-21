import java.util.Scanner;
public class Helo {
public static void main(String[] args) {
		int n,dig,size=0,i,j,temp,ans=0;
		Scanner a=new Scanner(System.in);
		System.out.println("enter the number");
n=a.nextInt();
System.out.println("enter the k value");
dig=a.nextInt();
int lol[]=new int[100];
for(j=0;n>0;j++){
	lol[j]=n%10;
	n=n/10;
	size++;
}
for(i=0;i<size;i++){
	for(j=0;j<size;j++){
		if(lol[i]>lol[j]){
			temp=lol[j];
			lol[j]=temp;
		}
	}
}
for(i=0;i<size-dig;i++){
	ans=ans*10+lol[i];
}
System.out.println(ans);	
}
	}



