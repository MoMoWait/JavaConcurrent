package test.run;

import java.util.concurrent.Exchanger;

import extthread.ThreadA;

public class Run {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		ThreadA a = new ThreadA(exchanger);
		a.start();
		/*try {
			String result = exchanger.exchange("MainThread");
			System.out.println(result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		System.out.println("main end!");
	}

}
