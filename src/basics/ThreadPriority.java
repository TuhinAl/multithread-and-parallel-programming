package basics;

public class ThreadPriority {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		Thread threadOne = new Thread(new EmailCampaign());
		Thread threadTwo = new Thread(new DataAggregator());
		
		threadOne.setName("Email Campaign");
		threadTwo.setName("Data Aggregrator");
		
		threadOne.setPriority(Thread.MAX_PRIORITY);
		threadTwo.setPriority(Thread.MIN_PRIORITY);
		
		threadOne.start();
		threadTwo.start();
	}

}

class EmailCampaign implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			if(i == 5) {
				Thread.currentThread().yield();
			}
		}
		
	}
	
}

class DataAggregator implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}
