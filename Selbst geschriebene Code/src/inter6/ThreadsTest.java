package inter6;

public class ThreadsTest {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MultithreadThging mtt2 = new MultithreadThging(i);
Thread t = new Thread(mtt2);
t.start();
t.isAlive();
try {
	t.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		}
//		MultithreadThging mtt = new MultithreadThging();
//
//		mtt.run();
		
		
	}

}
