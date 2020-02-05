/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stomp
 */
import java.util.*;

public class app {
    
    public static void main(String args[] ){
        
        Scanner input = new Scanner(System.in);
        System.out.print("ID: ");
        int id = input.nextInt();
        System.out.print("First name: ");
        String fname = input.nextLine();
        System.out.print("Last name: ");
        String lname = input.nextLine();
        System.out.print("Address: ");
        String street = input.nextLine();
        System.out.print("Age:");
        int age = input.nextInt();
        System.out.print("Gender: ");
        String gender = input.nextLine();
        
        Address address = new Address(id, fname, lname, street, age, gender);
        System.out.print(address.toString());
        
    }
    
    
}
