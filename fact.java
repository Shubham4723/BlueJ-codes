import java.io.*;
class fact
 {
   public static void main(String args[])
   throws IOException
     {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(" enter range no = ");
        n = Integer.parseInt(br.readLine());
        int f;
         for(int i=1;i<=n;i++)
          {
            f=1;
             for(int j=1;j<=i;j++)
               f = f * j;
                  
            if(f%3==0)
              System.out.print(" "+i);
                   
                }
                
             }
             
           }
