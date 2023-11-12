package ex2;

import java.io.FileWriter;
import java.io.IOException;

public class PythonThread extends Thread{
	@Override
	public void run() {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\tp3_java.txt",true);
			long depart = System.currentTimeMillis();
			for (int i = 0; i < 10000; i++) {
				fw.write("i love python\n");
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
