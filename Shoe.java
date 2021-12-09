package shoe_comparable;

import java.util.Scanner;

public class Shoe implements Comparable<Shoe> {
	static int i = 0 ;
	String marke;
	int size;
	static Shoe[] soldShoes= new Shoe[3];
	
	public Shoe(String marke, int size) {
		this.marke = marke;
		this.size = size;
	}
	// method to create an object of Shoe class and return it 
	public static Shoe make_Shoe(Scanner input) {
		System.out.println("enter your marke and size:");
		String marke = input.next();
		int size = input.nextInt();
		Shoe sh = new Shoe(marke , size);
		soldShoes[i++]= sh ;
		return sh;
	}
	
	@Override
	public String toString() {
		return "Shoe [marke=" + marke + ", size=" + size + "]";
	}
	@Override
	public int compareTo(Shoe sh) {
		return this.size - sh.size;
	}
}
