
package code_wars_questions;
import java.util.List;

public class BinaryArrayToNumber 
{
      public static int ConvertBinaryArrayToInt(List<Integer> binary) 
      {
        StringBuilder f = new StringBuilder();
        
        for(int i = 0; i < binary.size(); i++)
        {
            f.append(binary.get(i));
        }
        
        
        int result = Integer.parseInt(f.toString(), 2);
        return result;
      }
}
