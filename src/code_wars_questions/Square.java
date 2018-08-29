
package code_wars_questions;


public class Square 
{
    public static boolean isSquare(int n)
    { 
        n = 263651779;
        for(int i = 0; i < n; i++)
        {
            int squared = i*i;
            if (squared == n)
            {
                System.out.println("");
                return true;
            }
            else if(squared > n)
            {
                return false;
            }
        }
        return false;
    }
}
