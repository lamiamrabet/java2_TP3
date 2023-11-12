package ex1_suite;

import ex1.AndroidThread;
import ex1.PythonThread;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AndroidThread a =  new AndroidThread();
		PythonThread p =  new PythonThread();
		Thread th1 = new Thread(a);
		Thread th2 = new Thread(p);
		th1.start();
		th2.start();
	}

}
