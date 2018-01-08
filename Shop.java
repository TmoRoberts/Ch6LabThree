// ***************************************************************

//   Shop.java

//

//   Uses the Item class to create items and add them to a shopping

//   cart stored in an ArrayList.

// ***************************************************************


import java.util.ArrayList;

import java.util.Scanner;


public class Shop

{

    
    public static void main (String[] args)

    {
        ArrayList<Item> cart = new ArrayList<Item>();
        

        Item item;

        String itemName;

        double itemPrice;
        double totalPrice = 0; 

        int quantity;
        int totalQuantity = 0;

        Scanner scan = new Scanner(System.in);


        String keepShopping = "y";
        

        while (keepShopping.equals("y")) 

            {

                System.out.print ("Enter the name of the item: ");

                itemName = scan.next();


                System.out.print ("Enter the unit price: ");

                itemPrice = scan.nextDouble();
                totalPrice += itemPrice;

                System.out.print ("Enter the quantity: ");

                quantity = scan.nextInt();
                totalQuantity += quantity;

                // *** create a new item and add it to the cart
                Item thing = new Item(itemName, itemPrice, quantity);
                 
                cart.add(thing);


                // *** print the contents of the cart object using println 
                //System.out.println

                System.out.println(cart);
                System.out.print ("Continue shopping (y/n)? ");

                keepShopping = scan.next();

            }


        checkOut(cart);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Total Quantity: " + totalQuantity);
    }


   public static void checkOut(ArrayList<Item> yourCart) {
        String remove = "y";
        Scanner scan = new Scanner(System.in);
        String itemName = "null";
        //You do NOT need a getter method (think about public instance variables)
        

        //Print the contents of the cart (you may use the toString() method
        System.out.println(yourCart);
        
        //Ask the user if they would like to remove an item.  If yes, remove that item.
        for(int i =0; i < yourCart.size(); i++) {
            System.out.println(yourCart.get(i));
            System.out.println("Would you like to remove this item?");
            remove = scan.next();
            if (remove.equals("y")) {
                yourCart.remove(i);
                i--;
            }
        }
        System.out.println(yourCart);
        //Print final total of items and final price (total)
        
        


}

}