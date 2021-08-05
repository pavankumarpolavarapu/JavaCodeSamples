package io.github.pavankumarpolavarapu.multithreading;

public class Thread1 extends Thread {
	int runId;
	public Thread1(int runId) {
		super();
		this.runId = runId;
	}
	@Override
	public void run() {
		try {
			System.out.println("Thread1 Running with id "+ this.runId);
		} catch (Exception e) {
			System.out.println("Exception Raised " + e);
		}
	}
}
