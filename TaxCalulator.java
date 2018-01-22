/*******************************************************************
* Lab1.java
* <Alex Masson / Section B/ Thursday 4:30 - 6:30>
*
* This program calculates and displays a purchase order amount.
*******************
************************************************/
import java.util.*;
// Add import line here to use the Scanner class
public class Lab1 {
public static void main(String[] args)
{
	Scanner in = new Scanner (System.in);
// Declare a Scanner object here to be used for input
System.out.print("Please press enter");
String input =in.nextLine(); // read in user input as a string
	double price; // price of purchase item
	double qty; // number of items purchased
	double tax; // value of tax
System.out.print("Price of purchased item, please: "); // user prompt
	input = in.nextLine();// read input here as a string
	price = Double.parseDouble(input);// convert string to double and store in price variable
System.out.print("Quantity of items, please: "); // user prompt
	input = in.nextLine();// read input here as a string
	qty = Integer.parseInt(input);// convert string to integer and store in qty variable
System.out.print("Tax Rate as decimal please: "); //nicely ask person for tax rate
	input = in.nextLine(); //read their nice input
	tax = Double.parseDouble(input); //put their nice input into the tax value
double ttax = price*tax; //this is where we calculate tax
double total = price*qty; //this is where we calculate the total, to make it easier for me later
double taxtotal = total + ttax; //this is the true total including tax

// displays the final amount
System.out.println("Total purchase order = $" + price * qty);
// display the final amount w/2 decimals using printf
System.out.printf("Total purchase order = $%.2f\n", price * qty);
// display the final amount w/2 decimals using String.format
String output = String.format("Total purchase order = $%.2f\n", price * qty);
//display tax amount using printf
System.out.printf("Tax amount using printf = $%.2f\n", + ttax);
//display total with tax
System.out.printf("Total with tax using printf= $%.2f\n", + total);
//where we create a string for tax
String rtax = String.format("Tax amount using string = $%.2f\n", + ttax);
//where we create a string for the total
String totalwithtax = String.format("Total with tax using string = $%.2f\n", + taxtotal);
//display string tax
System.out.printf(rtax);
//display string total with tax
System.out.printf(totalwithtax);
System.out.printf(output);
in.close();
} // end main
} // end class Lab1
