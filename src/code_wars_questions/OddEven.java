package code_wars_questions;

public class OddEven 
{
    public static String oddOrEven(int[] array)
    {
        int temp = 0;
        for(int i = 0; i < array.length; i++)
        {
            temp += array[i];
        }
        
        if(temp % 2 == 0)
        {
            return "even";
        }
        else
        {
            return "odd";
        }
        
    }
    
}
