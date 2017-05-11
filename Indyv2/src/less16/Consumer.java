package less16;

public class Consumer implements Runnable{

	private final Singleton singleton = Singleton.getInstance();
	
	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		while (!singleton.queue.isEmpty()) {
			int random = singleton.queue.get(0);
			singleton.queue.remove(0);
			System.out.println(Thread.currentThread().getName()+" consumer "+random);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
