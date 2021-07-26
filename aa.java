class aa
  {
    public static void main(String args[])
      {
         int q = 65;
         int z = 97;
         int r = 0;
         int g = 1;
         for(int i=1;i<=4;i++)
          {
            r = i%2;
            if(r!=0)
              g = i*(-1);
              
            else 
              g = i;
              
              System.out.print(g+" "+(char)z+"/"+(char)q+"   ");
              
              q++;
              z++;
           }
        }
      }
 