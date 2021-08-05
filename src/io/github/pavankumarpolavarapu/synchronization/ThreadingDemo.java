package io.github.pavankumarpolavarapu.synchronization;

public class ThreadingDemo {

	public static void main(String[] args) {
		MathUtil obj = new MathUtil();
		

			Thread3 t1 = new Thread3(obj);
			t1.start();
			
			Thread t2 = new Thread(new Thread4(obj));
			t2.start();
			

	}
}
