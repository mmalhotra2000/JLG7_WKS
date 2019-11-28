package edu.gyansetu.tcs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestArrayList5 {

	public static void main(String[] args) {

		Wallet wallet1 = new Wallet(12, 233, "B1");
		Wallet wallet2 = new Wallet(14, 2336, "B2");

		Wallet wallet3 = new Wallet(9, 2336, "A1");

		Wallet wallet4 = new Wallet(10, 2336, "C1");
		Wallet wallet5 = new Wallet(16, 5666, "H1");

		ArrayList<Wallet> wallets = new ArrayList<Wallet>(5);

		wallets.add(wallet1);
		wallets.add(wallet2);
		wallets.add(wallet3);
		wallets.add(wallet4);
		wallets.add(wallet5);

		System.out.println("before sorting");
		wallets.forEach(System.out::println);

	
		// //sort bby wallet id
		WalletIdComparator walletIdComparator = new WalletIdComparator();

		//Collections.sort(wallets, walletIdComparator);
		
		
		Collections.sort(wallets,Comparator.comparing(Wallet::getWalletId));
		
		
		// sort bt price

		System.out.println("after sorting");
		wallets.forEach(System.out::println);

		// before sorting
		// Wallet [walletId=12, price=233, brand=B1]
		// Wallet [walletId=14, price=2336, brand=B2]
		// Wallet [walletId=9, price=2336, brand=A1]
		// Wallet [walletId=10, price=2336, brand=C1]
		// Wallet [walletId=16, price=5666, brand=H1]
		// after sorting
		// Wallet [walletId=16, price=5666, brand=H1]
		// Wallet [walletId=14, price=2336, brand=B2]
		// Wallet [walletId=9, price=2336, brand=A1]
		// Wallet [walletId=10, price=2336, brand=C1]
		// Wallet [walletId=12, price=233, brand=B1]

		// before sorting
		// Wallet [walletId=12, price=233, brand=B1]
		// Wallet [walletId=14, price=2336, brand=B2]
		// Wallet [walletId=9, price=2336, brand=A1]
		// Wallet [walletId=10, price=2336, brand=C1]
		// Wallet [walletId=16, price=5666, brand=H1]
		// after sorting
		// Wallet [walletId=16, price=5666, brand=H1]
		// Wallet [walletId=14, price=2336, brand=B2]
		// Wallet [walletId=10, price=2336, brand=C1]
		// Wallet [walletId=9, price=2336, brand=A1]
		// Wallet [walletId=12, price=233, brand=B1]

		// before sorting
		// Wallet [walletId=12, price=233, brand=B1]
		// Wallet [walletId=14, price=2336, brand=B2]
		// Wallet [walletId=9, price=2336, brand=A1]
		// Wallet [walletId=10, price=2336, brand=C1]
		// Wallet [walletId=16, price=5666, brand=H1]
		// after sorting
		// Wallet [walletId=16, price=5666, brand=H1]
		// Wallet [walletId=9, price=2336, brand=A1]
		// Wallet [walletId=10, price=2336, brand=C1]
		// Wallet [walletId=14, price=2336, brand=B2]
		// Wallet [walletId=12, price=233, brand=B1]

		// 128 3 34 67 13
		// 3 128 34 67 13
		// 3 34 128 67 13
		// 3 34 67 128 13
		// 3 34 67 13 128

		// 3 34 67 13 128

	}
}