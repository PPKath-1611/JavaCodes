
Code: 

import java.util.*; import java.io.*;

public class Main
{
  public static void main(String[] args)
 {
   String key = "praneshkjadsfoijhadfndepwdfskjnrewjnrlvkmnwrlkvnaeiijgnb";
   int len = key.length();
   char store[] = key.toCharArray();
   String res = "";
   for(int i=0;i<len;i++)
   {
      if(res.indexOf(store[i]) == -1)
      {
         res += store[i];
      }
   }
   System.out.print("String Extracted : " + res + "\n" + "Length of Extracted String : " + res.length());
 }
}

