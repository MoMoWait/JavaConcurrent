package test.run;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import myrunnable.MyRunnable;
import sun.net.www.content.audio.x_aiff;
import entity.Userinfo;

public class Run1 {

	public static void main(String[] args) {
		try {
			Userinfo userinfo = new Userinfo();
			MyRunnable myRunnable = new MyRunnable(userinfo);

			ExecutorService executor = Executors.newCachedThreadPool();
			CompletionService csRef = new ExecutorCompletionService(executor);

			Future<Userinfo> future = csRef.submit(myRunnable, userinfo);
			System.out.println(future.get().getUsername() + " "
					+ future.get().getPassword());
			executor.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
