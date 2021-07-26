import java.io.*;
public class top_hlil
 {
   public static void main(String args[])throws IOException
    {
      DataInputStream in=new DataInputStream(System.in);
        int n,i,j,k,c,p,m;   
       n=j=k=i=c=p=m=0;
   
       
         try
           { 
           System.out.print(" enter no of rows or columns = ");
           n = Integer.parseInt(in.readLine());
         
              for(i=1;i<=n;i++)
                {
                  c++;
                    
                    for(j=1;j<=n-i;j++)
                   { 
                     System.out.print("   ");
                   }
                     for(k=n;k>n-i;k--)
                     {
                      
                        if(k%2==0)
                      System.out.print(" " + "1" + " ");
                      
                      if(k%2!=0)
                      System.out.print(" " + "0" + " ");
                     }
                   
                   for(p=2;p<=i;p++)
                    {
                     m=p-1;   
                     m+=c;
                     
                     if(m%2==0)
                     System.out.print(" "+"1"+" ");
                     
                     if(m%2!=0)
                     System.out.print(" "+"0"+" ");
                    } 
                     System.out.println();
                }
            }
            catch(Exception e)
            {};
        }     
    }         
                      