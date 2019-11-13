package edu.gyansetu.tcs.oops.intro;

public class Wallet {

	private int walletId;
	private String walletName;

	public Wallet(int walletId, String walletName) {
		this.walletId = walletId;
		this.walletName = walletName;
	}

	public int getWalletId() {
		return walletId;
	}

	

	public String getWalletName() {
		return walletName;
	}

	public void setWalletName(String walletName) {
		this.walletName = walletName;
	};

}
