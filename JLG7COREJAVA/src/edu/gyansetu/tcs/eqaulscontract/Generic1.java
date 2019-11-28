package edu.gyansetu.tcs.eqaulscontract;

class Parcel<T> {

	private T obj;

	public Parcel(T obj) {
		super();
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}

class Book {

}

class Wallet {

}

public class Generic1 {

	public static void main(String[] args) {
		Book book1 = new Book();
		Wallet wallet1= new Wallet();
		
		Parcel<Book> parcel1 = new Parcel<Book>(book1);

		Book bookToSave = (Book) parcel1.getObj();
		
	//	Parcel<Wallet> parcel2 =  new Parcel<Wallet>(new Book());
	}

}