import java.io.*;
class income_tax
 {
   public static void main(String args[])
   throws IOException
    {
      int m,n=0;
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print(" Enter monthly Salary = ");
      m = Integer.parseInt(br.readLine());
      
      if(m<=200000)
       System.out.println(" Income tax = "+n);
       
      else
         if(m>200000 && m<=500000)
          {
            n = (int)(m*10)/100;
            System.out.println(" Income tax = "+n);
        }
      else
          {
            n = (int)30000+((m*30)/100);
            System.out.println(" Income tax = "+n);
        }
    }
}
           
      