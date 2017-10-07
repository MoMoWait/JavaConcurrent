package mycallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		try {
			while (true) {
				if (Thread.currentThread().isInterrupted() == true) {
					throw new InterruptedException();
				}
				System.out.println(Thread.currentThread().getName() + " "
						+ System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "�ҵ�������100";
	}

}
