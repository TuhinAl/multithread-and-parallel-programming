package basics;

public class MyFirstThread {

	
	public static void main(String[] args) {
		Task taskOne = new Task();
		
		Thread firstThread = new Thread(taskOne); // New state 
		
		firstThread.start();
		
		try {
			firstThread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Inside main method.........");
	}
}

 class Task implements Runnable{

	@Override
	public void run() {
		System.out.println(" Inside Run .............");
		go();
		
	}
	
	private void go() {
		System.out.println(" Inside go()....");
		more();
	}
	
	private void more() {
		System.out.println(" Inside more()....");
		
		
	}
	
}
