import java.util.Scanner;

public class Name {
public static void main(String args[])
{
	int tot1=0,tot2=0;
	Scanner s=new Scanner(System.in);
	int m1[]=new int[3];
	String student1=s.next();
	
	for(int i=0;i<m1.length;i++)
	{
		m1[i]=s.nextInt();
		tot1+=m1[i];
	}
	
	int m2[]=new int[3];
	String student2=s.next();
	for(int i=0;i<m2.length;i++)
	{
		m2[i]=s.nextInt();
		tot2+=m2[i];
	}
	if (tot1>tot2)
		System.out.println(student1);
	else
		System.out.println(student2);
	
	
}
}

