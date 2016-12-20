import java.io.*;
import java.util.*;

public class Faculty implements UserLogin {
  
  int flag=0;
  User f=new User();
  
  public void login () {
        
        Scanner s = new Scanner(System.in);
      
        System.out.println("Enter username : ");
        f.user = s.nextLine();
        System.out.println("Enter password :");
        f.userPassword = s.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader("FDetails.txt"))){
            String line = null ;
            while((line =br.readLine()) != null){
                String[] element;
                element = line.split(",");
                if(f.user.equals(element[0]) && f.userPassword.equals(element[1])){
                    flag=1;
                }  
            }

            if(flag == 1){
                System.out.println("Login successful");
                System.out.println("add students");
                
                
                    addstudent();
                    
                
            }
            else{
                System.out.println("No such username");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
            
  }

    public void addstudent(){

        System.out.println("Enter Username and Password");
        Scanner a = new Scanner(System.in);
        String us = a.nextLine();
        String ps = a.nextLine();
          
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("studentDetail.txt", true));
           writer.println(us + "," + ps);

            writer.close();
           } 
        catch (Exception e) {
            System.out.println("Error");
        }
        
        
    } 

}
