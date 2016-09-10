package pro;

import java.util.*;
 
public class Hunter28
{
    
    public static void main(String args[])
    {
    	Scanner scanner=new Scanner(System.in);
        String st =scanner.nextLine();
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<st.length();i++)
            lhs.add(st.charAt(i));
        for(Character ch : lhs)
            System.out.print(ch);
    
       
    }
}
