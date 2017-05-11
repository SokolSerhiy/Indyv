package less16;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		Some some = new Some();
//		new Thread(()->{
//			for(int i = 0; i < 500; i++){
//				some.increment();
//			}
//			System.out.println(some.getI());
//		}).start();
//		new Thread(()->{
//			for(int i = 0; i < 500; i++){
//				some.increment();
//			}
//			System.out.println(some.getI());
//		}).start();
//		Thread.sleep(2000);
//		System.out.println(some.getI());
		new Thread(new Producer()).start();
		new Thread(new Producer()).start();
		new Thread(new Consumer()).start();
		ExecutorService service = Executors.newFixedThreadPool(10);
		Future<String> future = service.submit(()->{
			Thread.sleep(4000);
			return "Hello";
		});
		System.out.println(future.get());
		service.shutdown();
//		Thread.sleep(2000);
//		System.out.println(Singleton.getInstance().queue.size());
	}
}