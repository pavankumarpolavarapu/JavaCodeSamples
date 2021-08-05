package io.github.pavankumarpolavarapu.synchronization;

public class Thread4 implements Runnable {
	MathUtil mu;
	public Thread4(MathUtil mu) {
		super();
		this.mu = mu;
	}
	@Override
	public void run() {
		try {
			mu.getMultiples(4);
		} catch (Exception e) {
			System.out.println("Exception Raised " + e);
		}
	}
}
