package test2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Thread2A extends Thread {

	private MyService2 service;

	public Thread2A(MyService2 service) {
		super();
		this.service = service;
	}

	public void run() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("A.txt")));
			for (int i = 0; i < 50000; i++) {
				writer.write("ThreadA" + (i + 1));
				writer.newLine();
				service.map.put("ThreadA" + (i + 1), "ThreadA" + i + 1);
				//System.out.println("ThreadA" + (i + 1));
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
