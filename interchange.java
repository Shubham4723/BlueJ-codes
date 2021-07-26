import java.io.*;
class interchange
   {
     public static void main(String args[])
     throws IOException
       {
          int n,c=0;
          InputStreamReader isr = new InputStreamReader(System.in);
          BufferedReader br = new BufferedReader(isr);
          
          System.out.print("enter a no =");
          n = Integer.parseInt(br.readLine());
          
          for(int i=n;i>0;i/=10)
             c++;
               
              int r=0,m=0,re=0,z=0; 
          for(int i=1;i<=c;i++)
            {
              r = n%10;
              n = n/10;
              re = n%((int)Math.pow(10,c-1));
              m = (int)(n/((int)Math.pow(10,c-1)));
              
              z=r;
              r=m;
              m=z;
              
              break;
             
              
            }
                System.out.print(m+re+r);
                
            }
        }
               
              
              
            