package program.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Ilangovan\\OneDrive\\Documents\\readfile.txt");
		
		Scanner ab = new Scanner(f);
		
		while(ab.hasNext()) {
			
			System.out.println(ab.nextLine());
		}

	}

}
