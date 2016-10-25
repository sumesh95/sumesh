import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram
{
    static void isAnagram(String s1, String s2)
    {
 
        String copyOfs1 = s1.replaceAll("\\s", "");
 
        String copyOfs2 = s2.replaceAll("\\s", "");
 
         
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {
 
            status = false;
        }
        else
        {
 
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
 
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();
 
            
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            
 
            status = Arrays.equals(s1Array, s2Array);
        }
 
 
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
 
    public static void main(String[] args)
    {
    	System.out.println("enter the strings");
    	String s1,s2;
    	Scanner scan=new Scanner(System.in);
    	s1=scan.next();
    	s2=scan.next();
        isAnagram(s1, s2);
 
        
        
 
         
    }
}

