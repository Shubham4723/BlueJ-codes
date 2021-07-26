import java.io.*;
class input_3
 {
   public static void main(String args[])
   throws IOException
     {
        int n=0,m,r=0,p=1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(" enter a 3 digit no = ");
        n = Integer.parseInt(br.readLine());
        m = n;
        int flag = 0;
        for(int i=1;i<=m;i++)
         {
           r = n%10;
           
           if(r%2!=0)
             {
              p = p*r;
              flag++;
            }
          
            
          n = n/10;
           if(n==0)
           break;
        }
        
        if(flag==0)
          p=0;
          
          System.out.println(" product of odd digits = "+p);
        }
    }