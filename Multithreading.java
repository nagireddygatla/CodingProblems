package concepts;

public class Multithreading {

	public static void main(String args []){
	Runner runner1 = new Runner();
	runner1.start();
	Runner runner2 = new Runner();
	runner2.start();
	}

}

class Runner extends Thread{

	@Override
	public void run() {
		try {
		for(int i=0;i<10;i++){
			
			System.out.println("Hello"+i);
			Thread.sleep(100);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
