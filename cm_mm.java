class cm_mm
 {
   public static void main(String args[])
     {
       int a,b,c,d,s1,s2,s3,s4;
             
       a = 4;
       b = 9;
       c = 5;
       d = 8;
       s1 = a+c;
       s2 = b+d;
        if(s2>=10)
          {
            int r = s2%10;
            int y = (int)s2/10;
             s3 = s1+y;
             s4 = r;
        }
           else
            {
              s3 = s1;
              s4 = s2;
            }
            System.out.println(a+"cm"+" "+" "+b+"mm");
            System.out.println(c+"cm"+" "+" "+d+"mm");
            System.out.println("+");
            System.out.println("------------------------");
            System.out.println(s3+"cm"+" "+" "+s4+"mm");
            
        }
    }
          