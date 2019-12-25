package edu.gyansetu.tcs.jdbc;

import java.util.ArrayList;
import java.util.Scanner;

public class TestInvoice {

	public static void main(String[] args) {

		InvoiceRepo baseRepo = new InvoiceRepo();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter choice");

		System.out.println("1. ) Create customer");
		System.out.println("2. ) Update customer");
		System.out.println("3. ) Delete customer");
		System.out.println("4. ) Find All customers");

		int ch = scanner.nextInt();
		if (ch == 1) {

			System.out.println("Enter customer name");
			String cname = scanner.next();
			System.out.println("Enter customer Id");
			int id = scanner.nextInt();
			System.out.println("Enter customer discount");
			int di = scanner.nextInt();

			Customer customer = new Customer(id, cname, di);

			baseRepo.save(customer);

		}

		ArrayList<Invoice> invoices = baseRepo.findByCustomerName("Mohit");

		System.out.println(invoices);

	}

}
