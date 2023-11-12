package ex2;

import ex1.AndroidThread;
import ex1.PythonThread;

public class TestEx2 extends Thread{

	public static void main(String[] args) {
		AndroidThread a =  new AndroidThread();
		PythonThread p =  new PythonThread();
		/*Thread th1 = new Thread(a);
		Thread th2 = new Thread(p);*/
		
		a.setName("thread android");
		p.setName("thread python");
		a.setPriority(MAX_PRIORITY);
		p.setPriority(MIN_PRIORITY);
		a.start();
		p.start();
		
	}

}
