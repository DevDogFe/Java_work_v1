package ch06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest1 {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("data.txt");
			// 보조 기반 스트림 활용
			DataOutputStream dos = new DataOutputStream(fos);

			// dos.write(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14F);
			dos.writeUTF("TEST UTF");
			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 데이터 단위로 읽기

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("data.txt");
			// 보조 data
			DataInputStream dis = new DataInputStream(fis);
			char a = dis.readChar();
			int b = dis.readInt();
			float c = dis.readFloat();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(dis.readUTF());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} // end of main

}
