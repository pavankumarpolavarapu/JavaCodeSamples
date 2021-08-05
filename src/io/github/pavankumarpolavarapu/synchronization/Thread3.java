package io.github.pavankumarpolavarapu.synchronization;

public class Thread3 extends Thread {
	MathUtil mu;
	public Thread3(MathUtil mu) {
		super();
		this.mu = mu;
	}
	@Override
	public void run() {
		try {
			mu.getMultiples(3);
		} catch (Exception e) {
			System.out.println("Exception Raised " + e);
		}
	}
}
