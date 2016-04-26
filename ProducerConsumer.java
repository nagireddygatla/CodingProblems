package concepts;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String args []){

		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				
				producer();
			}
			
			
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				consumer();
				
			}
			
			
			
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	protected static void consumer() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(rand.nextInt(10)==0){
				try {
					Integer val = queue.take();
					System.out.println("The value taken is:"+val+", size of queue:"+queue.size());
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
	}

	protected static void producer() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		while(true){
			try {
				queue.put(rand.nextInt(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	

}
