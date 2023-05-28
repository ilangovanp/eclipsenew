package program.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter hg= new FileWriter("C:\\Users\\Ilangovan\\OneDrive\\Documents\\Writefileexample.txt");
		BufferedWriter ty= new BufferedWriter(hg);
		ty.write("practice writing\n");
		ty.write("welcome to good things");
		
		System.out.println("finished !!!!!!!!!!!!!!");
		ty.close();

	}

}
