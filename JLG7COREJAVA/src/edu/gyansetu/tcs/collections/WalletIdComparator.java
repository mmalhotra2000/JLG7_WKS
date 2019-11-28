package edu.gyansetu.tcs.collections;

import java.util.Comparator;

public class WalletIdComparator implements Comparator<Wallet> {

	@Override
	public int compare(Wallet o1, Wallet o2) {

		return o1.getWalletId()-o2.getWalletId();
	}

}
