package code_wars_questions;


public class Solution1 
{
    Solution1(String s, int k)
    {
        solve(s, k);
    }
    static int count = 0;
    public static String solve(String s, int k) 
    {
        //First remove all letter 'a'
        //Then remove all letter 'b'
        char remove = 'a';
        //For each k, remove an a from the left
        for(int i = 0; i < s.length() + 1; i++)
        {
            //Our issue is that we are creating a new string and then iterating from the previous number
            //If we have reached past z, there are no more characters left
            if(remove == '{' || count == k)
            {
                System.out.println(s);
                return s;
            }
            
            if(i == s.length())
           {
               remove += 1;
               i = 0;
           }
           
           if(count == k-1 && s.length() == 1)
           {
               return "";
           }
          
            
            //If we have reached a target character
            if(s.charAt(i) == remove)
            {
                //Create a copy of string without target char inside
                if(s.length() > 1)
                {
                    if(s.charAt(i) == 0)
                    {
                        s = s.substring(i+1, s.length());
                        i = 0;
                        count++;
                        continue;
                    }
                    else if(s.charAt(i) == s.length())
                    {
                        s = s.substring(i-1, 0);
                        i = 0;
                        count++;
                        continue;
                    }
                    else
                    {
                        s = s.substring(0, i) + s.substring(i + 1, s.length());
                        i = 0;
                        count++;
                       
                    }
                }
                else if(s.length() == 1)
                {
                    if(s.charAt(i) == 0)
                    {
                        s = s.substring(1);
                        i = 0;
                        count++;
                        continue;
                    }
                    else if(s.charAt(i) == 1)
                    {
                        s = s.substring(0);   
                        i = 0;
                        count++;
                        continue;
                    }
                }
              
            }
            
          
          
        }
        
        
        return ""; 
    }
}