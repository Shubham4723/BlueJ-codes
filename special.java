import java.io.*;
class special
  {
    public static void main(String args[])
    throws IOException
      {
         int n,f,s = 0;
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         System.out.print("Enter a no = ");
         n = Integer.parseInt(br.readLine());
         int m = n,r = 0;
           for(int i=1;i<=m;i++)
             {
               f = 1;
               r = n % 10;
               
                 for(int j=1;j<=r;j++)
                   f = f * j;
                   
              s = s + f;
               n = n/10;     
              if(n==0)
               break;
                }    
            
          if(s==m)
            System.out.println(" it is a special no  ");
            
          else 
            System.out.println(" not a special no ");
           
          }
          
       }