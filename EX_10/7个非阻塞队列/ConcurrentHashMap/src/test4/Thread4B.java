package test4;

public class Thread4B extends Thread {

	private MyService4 myService;

	public Thread4B(MyService4 myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		myService.hashtable.put("z", "zValue");
	}
}
