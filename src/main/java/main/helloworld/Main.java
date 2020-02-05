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
        
        int age = 5;
        
        
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
        
         if (userAge>18) {
            System.out.println("Osoba je punoletna.");
    } else {
            System.out.println("Osoba je maloletna.");
        }
        
         
         
         
        System.out.print("Unesite broj godina:");
        input = new Scanner(System.in);
        int personAge = input.nextInt();
        
         if (personAge <=0 && personAge > 150) {
             System.out.println("Invalid1");
        } else if   (personAge <= 5 ) {
            System.out.println("Baby");
        } else if (personAge <= 11) {
            System.out.println("Kid");
        } else if (personAge <=17) {
            System.out.println("Teen");
        } else if (personAge >= 18) {
                 System.out.println("Adult");
        } 
        
         
     
            Scanner input = new Scanner(System.in); 
	    System.out.println("Unesite redni broj dana u nedelji (1 do 7):");   
	    int day = input.nextInt();   
	    
	    switch (day){     
	        case 1: 
	            System.out.println("Ponedeljak");
	            break;
	        case 2: 
	            System.out.println("Utorak");
	            break;
	        case 3: 
	            System.out.println("Sreda");
	            break;
	        case 4: 
	            System.out.println("Cetvrtak");
	            break;
	        case 5: 
	            System.out.println("Petak");
	            break;
	        case 6: 
	            System.out.println("Subota");
	            break;
	        case 7: 
	            System.out.println("Nedelja");
	            break;
	       default:
	            System.out.println("Morate upisati broj od 1 do 7")






         
       }
         
}
