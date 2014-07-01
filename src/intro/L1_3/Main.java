package intro.L1_3;

import intro.L1_2.MyThread;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		for (int i = 0; i < 10000; i++)
			System.out.print("Good!");

	}

}
