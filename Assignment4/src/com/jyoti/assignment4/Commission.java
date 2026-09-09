package com.jyoti.assignment4;
import java.util.Scanner;
public class Commission {

	  String name;
	    String address;
	    String phone;
	    double sales_amount;

	    void acceptDetails() {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter name: ");
	        name = sc.nextLine();

	        System.out.print("Enter address: ");
	        address = sc.nextLine();

	        System.out.print("Enter phone: ");
	        phone = sc.nextLine();

	        System.out.print("Enter sales amount: ");
	        sales_amount = sc.nextDouble();
	    }

	    void calculateCommission() {

	        double commission;

	        if (sales_amount >= 100000) {
	            commission = sales_amount * 0.10;
	        }
	        else if (sales_amount >= 50000) {
	            commission = sales_amount * 0.05;
	        }
	        else if (sales_amount >= 30000) {
	            commission = sales_amount * 0.03;
	        }
	        else {
	            commission = 0;
	        }

	        System.out.println("\nName: " + name);
	        System.out.println("Address: " + address);
	        System.out.println("Phone: " + phone);
	        System.out.println("Sales Amount: " + sales_amount);
	        System.out.println("Commission: " + commission);
	    }

	public static void main(String[] args) {
		
		Commission c = new Commission();

        c.acceptDetails();
        c.calculateCommission();
		
	}

}
