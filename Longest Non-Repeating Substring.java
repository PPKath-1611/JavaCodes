
Code: 

import java.util.*; import java.io.*;

public class Main
{
  public static void main(String[] args)
 {
   String key = "praneshkjadsfoijhadfndepwdfskjn", out = "";
   int len_max = -1;
   if(key.isEmpty())
   {
     System.out.println(0);  
   }
   if(key.length() == 1)
   {
     System.out.println(1);  
   }
   for(char i: key.toCharArray())
   {
     String curr = String.valueOf(i);
     if(out.contains(curr))
     {
       out = out.substring(out.indexOf(curr) + 1);
     }
     out += String.valueOf(i);
     len_max = Math.max(out.length(), len_max);
   }
   System.out.print("String Extracted : " + out + "\n" + "Length of Extracted String : " + len_max);
 }
}

//  OUTPUT 

// String Extracted : epwdfskjn
// Length of Extracted String : 9
