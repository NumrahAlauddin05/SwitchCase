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

        Scanner user = new Scanner(System.in);
        System.out.println("ENter any number");
       // int option = user.nextInt();
        long option1 = 678;
//        if(num1==1){
//            
//        }
        //byte ,short ,int ,char,String
//        switch (option) {
//
//            case 1: {
//                System.out.println("Addition");
//                break;
//            }
//            case 2: {
//                System.out.println("Subtraction");
//                break;
//            }
//            case 3: {
//                System.out.println("Multiply");
//                break;
//            }
//            case 1001: {
//                System.out.println("Divide");
//                break;
//            }
//            default: {
//                System.out.println("Invalid");
//            }
//
//        }
       // char ch = user.next().charAt(0);
        //if(ch=='a')
//        switch (ch) {
//            case 'a':
//            case 'A': {
//                System.out.println("This is a");
//                break;
//            }
//
//            case 'b':
//            case 'B': {
//                System.out.println("This is b");
//                break;
//            }
//            default: {
//                System.out.println("Invalid");
//            }
//        }
        String choice = "Create Account";
        Scanner scan = new Scanner(System.in);
        int age;
        switch (choice) {

            case "Create Account": {
                System.out.println("Enter your details ");
                System.out.println("Enter your age");
               // age = scan.nextInt();

//                if (age >= 20 && age <= 30) {
//                    System.out.println("valid age");
//                } else {
//                    System.out.println("Invalid age");
//                }

//                switch(country){
//                    
//                    case "Pakistan":
//                    {
//                        System.out.println("Valid country");
//                        
//                    }
//                    default:{
//                        System.out.println("Invalid country");
//                    }
//                }
                break;
            }

            case "Login": {
                age = 5;
                System.out.println("Login your account");
                break;
            }

            default: {
                System.out.println("Invalid option");
            }

        }

        System.out.println("End");

        System.out.println("Enter your country");
        String country = scan.next();

        System.out.println("Enter your education");
        String education = scan.next();

//                switch(country){
//                    
//                    case "Pakistan":{
//                        
//                        System.out.println("Valid country");
//                        
//                        switch(education){
//                            case "BS":
//                            {
//                                
//                            }
//                            case "MS":
//                            {
//                                
//                            }
//                            case "PHD":{
//                                
//                            }
//                        }
//                        break;
//                    }
//                    
//                    case "INdia":{
//                        
//                    }
//                    default:
//                        System.out.println("Invalid country");
//                    
//                }
        switch (country) {

            case "Pakistan": {

                System.out.println("Valid country");
                
               if(education.equals("BS")){
                   System.out.println("Valid education");
               }
               else if(education.equals("MS")){
                   System.out.println("abc");
               }
               else{
                   System.out.println("Invalid");
               }
                break;
            }
            default:{
                System.out.println("Invalid");
            }
        }

            if ((country.equals("Pakistan")) && education.equals("BS")) {
                
                
                System.out.println("Valid");

            }
            else{
                System.out.println("Invalid");
            }

        }

    }
