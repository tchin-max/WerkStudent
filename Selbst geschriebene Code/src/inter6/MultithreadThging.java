package inter6;

public class MultithreadThging implements Runnable {
	int threadNumber;
	public MultithreadThging(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " from thread " + threadNumber);
//			if (threadNumber ==3) {
//				throw new IllegalArgumentException();
//				
//			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
