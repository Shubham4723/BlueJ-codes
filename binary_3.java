import java.io.*;

public class binary_3
 {
   public static void main(String args[])throws IOException
    {
      int i,j,k,z;
      z=1;
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));

      System.out.print("enter no of columns or rows=");
      int n=Integer.parseInt(obj.readLine());
      
      for(i=1;i<=n;i++)
      {
    
       
        if(i%2!=0)
           z=0;
           
        else
          z=1;
       
        
       
       
     for(j=1;j<=i;j++)
       { 
         if(z%2!=0)
          {
            
           System.out.print(" "+z+" ");
             z--;
           }
          
        else
         {
           
          System.out.print(" "+z+" "); 
           z++;
           }
          
          
         }
        
        System.out.println();
        }
        
    }
}
              
              