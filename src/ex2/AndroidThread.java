package ex2;

import java.io.FileWriter;
import java.io.IOException;

public class AndroidThread extends Thread{
	
	@Override
	public void run() {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\tp3_java.txt", true);
			long depart = System.currentTimeMillis();

			for (int i = 0; i < 10; i++) {
				fw.write("i love android\n");
			}			
			long fin = System.currentTimeMillis()-depart;
			System.out.println(fin);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	
}
