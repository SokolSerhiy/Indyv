package less16;

public class Producer implements Runnable{
	
	private final Singleton singleton = Singleton.getInstance();

	@Override
	public void run() {
		for(int i = 0; i < 500; i++){
			int random = random(1, 50);
			singleton.queue.add(random);
			System.out.println(Thread.currentThread().getName()+" producer "+random);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int random(int min, int max){
		return (int)Math.round(Math.random()*(max-min)+min);
	}
}