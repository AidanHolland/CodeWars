
package code_wars_questions;

public class DnaStrand 
{
  public static String makeComplement(String dna) 
  {
    //Your code
      StringBuilder temp = new StringBuilder(dna);
      for(int i = 0; i < temp.length(); i++)
      {
          switch(temp.charAt(i))
          {
              case 'T':
                  temp.setCharAt(i, 'A');
                  break;
              case 'A':
                  temp.setCharAt(i, 'T');
                  break;
              case 'G':
                  temp.setCharAt(i, 'C');
                  break;
              case 'C':
                  temp.setCharAt(i, 'G');
                  break;
          }
          
      }    
      return temp.toString();
  }
}