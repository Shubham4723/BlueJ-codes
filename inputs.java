import java.io.*;
class inputs
 {
   public static void main(String args[])
   throws IOException
     {
       char ch;
       //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int c = 0;
       int alp = 0;
       int num = 0;
       //ch = (char)br.read();
       for(int i=1;i<=1000;i++)
       {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
             System.out.print(" enter characters = ");
             ch = (char)br.read();
           if(ch=='0')
              break;
              if((ch>=65 && ch<=90) ||(ch>=97 && ch<=122))
               alp++;
             else
              num++;
             
              c++;
            }
            
         System.out.println(" no of characters entered = "+c);
         System.out.println(" no of alphabets = " + alp);
         System.out.println(" no of numbers = " + num);
        }
    }    
 
