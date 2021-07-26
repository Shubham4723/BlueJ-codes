class deci_frac
 {
    public static void main(String args[])
     {
       float f = 2.750f;
       int k = 100,z = 2;
       int g = (int)f;
       int hh;
       float h = f-g;
        h = h * 100;
        hh = (int)h;
        System.out.println("hh = " + hh);
        
        int x = 0,y = 0;
        for(int i=2;i<=100;i++)
         {
            x = hh%z;
            y = k%z;
            
             if(x==0 && y==0)
              {
                hh = hh/z;
                k = k/z;
              }
              else 
                z++;
               if(hh==0 || k==0)
                break;
            }
             System.out.println("hh = " + hh + "\t" + "k = " + k);
             
         System.out.print(g+" "+hh+"/"+k);
        }
    }
       