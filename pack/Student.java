import java.io.*;
import java.util.*;

public class Student extends Questions implements UserLogin{  
 
   int flag=0,marks;
   User u= new User();
 

    public void login (){
        
        String p;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username : ");
        u.user = s.nextLine();
        
        System.out.println("Enter password :");
        p = s.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader("studentDetail.txt"))){
        String inpt = null ;
       while((inpt =br.readLine()) != null){
       String[] element;
        element = inpt.split(",");
            if(u.user.equals(element[0]) && p.equals(element[1])){
                    flag=1;
                }
                
                }
                

            if(flag == 1){
            System.out.println("Login successful");
            marks=test(u.user);
            }
            else{
            System.out.println("No such username");
            }
        }catch (IOException e) {
      e.printStackTrace();
    }

            
        }



    

}
