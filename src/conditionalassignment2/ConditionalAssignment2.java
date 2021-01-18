/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalassignment2;

import java.util.Scanner;

/**
 *
 * @author NAVTTC07
 */
public class ConditionalAssignment2 {

    public static void main(String[] args) {
        
        Scanner user=new Scanner(System.in);
        System.out.println("ENter any number");
        int option=user.nextInt();
        
//        if(num1==1){
//            
//        }
     
        switch(option){
            
            case 1 :{
                System.out.println("Addition");
                break;
            }
            case 2:{
                System.out.println("Subtraction");
                break;
            }
            case 3:{
                System.out.println("Multiply");
                break;
            }
            case 4:
            {
                System.out.println("Divide");
                break;
            }
            default:{
                System.out.println("Invalid");
            }
            
        }    
        char ch=user.next().charAt(0);
        //if(ch=='a')
        switch(ch){
            case 'a':{
                System.out.println("This is a");
                break;
            }
            case 'b':
            {
                System.out.println("This is b");
                break;
            }
            default:{
                System.out.println("Invalid");
            }
        }
        
        
        System.out.println("End");
        
    }
    
}
