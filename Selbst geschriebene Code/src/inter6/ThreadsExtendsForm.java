package inter6;
class secondOne implements Runnable {
int sleepy =0 ;
	@Override
	public void run() {
for (int i = 0; i < 6; i++) {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(i  +"from the last one" +sleepy );
	
}		
	}
	
	
}
public class ThreadsExtendsForm extends Thread{
	int sleepy =0;
	@Override
	public void run() {
	for (int i = 0; i <= 5; i++) {
		System.out.println(i + sleepy++);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	}
	
	public static void main(String[] args) {
		ThreadsExtendsForm t = new ThreadsExtendsForm();
		secondOne s = new secondOne();
		s.run();
		//t.start();
		//t.run();
	}

}
