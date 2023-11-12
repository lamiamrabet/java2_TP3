package ex1_suite;

import java.io.FileWriter;
import java.io.IOException;

public class PythonRunnable implements Runnable{
	
	@Override
	public void run() {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\tp3_java.txt",true);
			for (int i = 0; i < 10; i++) {
				fw.write("i love python\n");
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
