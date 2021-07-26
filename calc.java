import java.io.*;
class calc
 {
   public static void main(String args[])
   throws IOException
     {
        float n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(" enter a no = ");
        n = Float.parseFloat(br.readLine());
        
        float m;
        for(int i=1;i<=1000;i++)
         {
           BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
           
           System.out.print(" enter an operator = ");
           char ch = (char)obj.read();
           
           if(ch=='=')
                break;
                
           System.out.print(" enter another no = ");
           m = Float.parseFloat(br.readLine());
            
           
               
                
              
             if(ch=='+')
              n = n+m;
           
            else
              if(ch=='-')
                n = n-m;
                
            else
               if(ch=='*')
                 n = n*m;
                 
            else 
                if(ch=='/')
                 n = (float)(n/m);
             
            
            }
              System.out.println(" your output = "+n);
           
            }
        }