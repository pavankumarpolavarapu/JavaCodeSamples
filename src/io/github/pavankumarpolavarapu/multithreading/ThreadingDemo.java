package io.github.pavankumarpolavarapu.multithreading;

public class ThreadingDemo {

	public static void main(String[] args) {
		int n = 10;
		
		for (int i=0; i<n; i++) {
			Thread1 t1 = new Thread1(i);
			t1.start();
			
			Thread t2 = new Thread(new Thread2(i));
			t2.start();
			
		}
	}
}
