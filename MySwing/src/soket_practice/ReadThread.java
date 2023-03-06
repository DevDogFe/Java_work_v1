package soket_practice;

import java.io.BufferedReader;
import java.io.IOException;

public class ReadThread implements Runnable{
	
	BufferedReader reader;

	public ReadThread(BufferedReader reader) {
		this.reader = reader;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String msg = reader.readLine();
				System.out.println(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
		
	}

	

}
