package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderFree {

	// main
	public static void main(String[] args) {

		BufferedReader reader = null;
		BufferedWriter writer = null;
		String line;
		try {
			reader = new BufferedReader(new FileReader("output1.txt"));
			writer = new BufferedWriter(new FileWriter("output01.txt"));
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				writer.write(line);
				writer.newLine();
			}
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	} // end of main

} // end of class
