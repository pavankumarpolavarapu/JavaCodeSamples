package io.github.pavankumarpolavarapu.multithreading;

public class Thread2 implements Runnable{
	int runId;
	
	public Thread2(int runId) {
		super();
		this.runId = runId;
	}

	@Override
	public void run() {
		try {
			System.out.println("Thread2 Running with id "+ this.runId);
		} catch (Exception e) {
			System.out.println("Exception Raised " + e);
		}
	}
	
}
