package test2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Thread2B extends Thread {

	private MyService2 service;

	public Thread2B(MyService2 service) {
		super();
		this.service = service;
	}

	public void run() {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("B.txt")));
			for (int i = 0; i < 50000; i++) {
				writer.write("ThreadB" + (i + 1));
				writer.newLine();
				service.map.put("ThreadB" + (i + 1), "ThreadB" + i + 1);
				//System.out.println("ThreadB" + (i + 1));
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
