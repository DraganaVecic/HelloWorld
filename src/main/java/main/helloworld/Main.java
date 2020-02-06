package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        System.out.println("Dragana Vecic");
        
    /*  int age = 5;
        
        
       if (age>18) {
            System.out.println("Osoba je punoletna.");
    } else {
            System.out.println("Osoba je maloletna.");
        }
        
        
        System.out.println("Unesite broj godina:");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();
        
        System.out.println("Korisnik je uneo: " + userAge);
        
        
        
        // 0-5 -> Baby
        // 6-11 -> Kid
        // 12-17 -> Teen
        // 18+ -> Adult
        // other -> Invalid
//        
//         if (userAge>18) {
//            System.out.println("Osoba je punoletna.");
//    } else {
//            System.out.println("Osoba je maloletna.");
//        }
        
         
         
         
//        System.out.print("Unesite broj godina:");
//        input = new Scanner(System.in);
//        int personAge = input.nextInt();
//        
//         if (personAge <=0 && personAge > 150) {
//             System.out.println("Invalid1");
//        } else if   (personAge <= 5 ) {
//            System.out.println("Baby");
//        } else if (personAge <= 11) {
//            System.out.println("Kid");
//        } else if (personAge <=17) {
//            System.out.println("Teen");
//        } else if (personAge >= 18) {
//                 System.out.println("Adult");
//        } 
//        
//         
//     
//            Scanner input = new Scanner(System.in); 
//	    System.out.println("Unesite redni broj dana u nedelji (1 do 7):");   
//	    int day = input.nextInt();   
//	    
//	    switch (day){     
//	        case 1: 
//	            System.out.println("Ponedeljak");
//	            break;
//	        case 2: 
//	            System.out.println("Utorak");
//	            break;
//	        case 3: 
//	            System.out.println("Sreda");
//	            break;
//	        case 4: 
//	            System.out.println("Cetvrtak");
//	            break;
//	        case 5: 
//	            System.out.println("Petak");
//	            break;
//	        case 6: 
//	            System.out.println("Subota");
//	            break;
//	        case 7: 
//	            System.out.println("Nedelja");
//	            break;
//	       default:
//	            System.out.println("Morate upisati broj od 1 do 7")
//
//
//
//        
//               
//        
//       /* Scanner input = new Scanner(System.in); 
//	System.out.println("Unesite redni broj dana u nedelji (1 do 7):");   
//	int day = input.nextInt(); 
//        
//        if(day == 1) {
//                System.out.println("Ponedeljak");
//
//        } else if(day == 2) {
//            System.out.println("Utorak");
//
//        } else if(day == 3) {
//            System.out.println("Sreda");
//
//        } else if(day == 4) {
//            System.out.println("Cetvrtak");
//
//        } else if(day == 5) {
//            System.out.println("Petak");
//
//        } else if(day == 6) {
//            System.out.println("Subota");
//
//        } else if(day == 7) {
//            System.out.println("Nedelja");
//
//        } else {
//            System.out.println("Morate uneti broj izmedju 1-7.");
//        }*/
//
//    }
//                  
//            
            System.out.println("While loop:");
    
            int x =5;
            while (x < 10) {
                System.out.println(x);
                x = x+1; 
                //x++;
            }
            
            
            System.out.println("While loop2:");
    
            x = 10;
            while (x > 0) {
                System.out.println(x);
                //x = x-1; 
                x--;
            }
            
            
            System.out.println("Do While loop:");
            x = 20;
            do {
                System.out.println(x);
                x--;
            } while (x > 15);
            
            
             System.out.println("For loop:");
             for (int i = 50; i < 60; i++) {
                    System.out.println(i);
            }
            
            
            System.out.println("For loop1:");
             for (int i = 20; i < 30; i++) {
                    System.out.println(i);
            }
             
             
             System.out.println("For loop2:");
             for (int i = 30; i >= 20; i--) {
                    System.out.println(i);
            }
             
             
             
           // for (int i = 0; i < 10; i++){
           //  for (int j = 0; j < 10; j++) {
           //       System.out.print("*");
           //    }    
           //}
             
             // i=0
             //     j=0
                //  *
             //     j=1
             //     *
             //     j=2 
             //     *
             //
             // j=9
             //     .prebaci u novi red
             // i=1
             //     j=0
             //
             
             
             // zadatak 1; formirati kvadrat
             // zadatak 2: (0.0) (0.1) (0.2).....(0.9)
             // (1.0) (1.1) ...
             // ....
             // ....
             // (9.0) (9.1)
             
             // Zadatak3:
             // (1.1) (1.2) (1.1) .... (1.1)
             // (2.1) (2.2) ...
             //...
             //...
             // (10.1) (10.2) ....
    
             
             
             //Zadatak 1:

             System.out.println("Kvadrat");
             for (int i = 0; i < 10; i++){
                for (int j = 0; j < 10; j++) {
                    System.out.print("*");
                }   
                System.out.println();
            }
             
             //Zadatak 2:
             
             System.out.println("Koordinate 1: ");
             for (int i = 0; i < 10; i++){
                for (int j = 0; j < 10; j++) {
                    System.out.print("(" + i + "," + j + ") ");
                }   
                System.out.println();
            }
             
             //Zadatak3:
             
             
             System.out.println("Koordinate 2: ");
             for (int i = 1; i <= 10; i++){
                for (int j = 1; j <=10; j++) {
                    System.out.print("(" + i + "," + j + ") ");
                }   
                System.out.println();
            }
             
             
    
             
        
             
             
             
             
    }   
         
 }
         

