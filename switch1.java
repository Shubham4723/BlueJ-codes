import java.io.*;

class switch1
  
{
    
public static void main(String args[])
    
throws IOException
      
{
        
char ch;
       
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
System.out.print("enter characters for the names of the week =");
        
ch=(char)br.read();
        
        
switch(ch)
         
   {
           
      case 's':
           
      case 'S':System.out.println("sunday");
           
      break;
           
          

     case 'm':
           
     case 'M':System.out.println("monday");
           
     break;
           
           

      case 't':
          
      case 'T':System.out.println("tuesday");
           
      break;
           
           
   
      case 'w':
           
     case 'W':System.out.println("wednesday");
            
     break;
           
           

     case 'h':
           
     case 'H':System.out.println("thursday");
           
     break;
           
           

     case 'f':
          
     case 'F':System.out.println("friday");
            
     break;
           
           

     case 'a':
          
     case 'A':System.out.println("saturday");
           
     break;
           
           default:System.out.println("you idiot");
           
         
}
      
}
}

           
           
           
        
