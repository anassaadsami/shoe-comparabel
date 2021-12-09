package shoe_comparable;

import java.io.BufferedReader;
//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String x ;
		try {
			File f = new File("/Users/Hiba/Desktop/dataOfObjects/", "Array of shoes");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			x = br.readLine();
			while (!x.equals("exit")) {
				try {
					BufferedWriter bwr = new BufferedWriter(new FileWriter(f, true));

					

//					bwr.write(x); 
//					bwr.newLine(); 
					Shoe.make_Shoe(input);
//					bwr.write(x); 
//					bwr.newLine(); 
					Shoe.make_Shoe(input);
//					bwr.write(x); 
//					bwr.newLine(); 
					Shoe.make_Shoe(input);
					
					for (Shoe item : Shoe.soldShoes) {
						System.out.println(item);
					}
					System.out.println();
					Arrays.sort(Shoe.soldShoes);
					for (Shoe item : Shoe.soldShoes) {
						System.out.println(item);
					}
					bwr.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				x = br.readLine(); // without this code it will be infinite loop ??
				input.close();

			}
			br.close();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
