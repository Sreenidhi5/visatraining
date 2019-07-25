package com.visa.training.streams;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class SearchWorker extends Thread{
	String filename;
	Queue<File> fileQueue;
	List<File> results;
	public SearchWorker(String filename, Queue<File> fileQueue, List<File> results) {
		super();
		this.filename = filename;
		this.fileQueue = fileQueue;
		this.results = results;
	}

	public void run() {
		while(true) {
			File aFileOrFolder =fileQueue.poll();
			if(aFileOrFolder == null) {
				break;
			}
			 if(aFileOrFolder.isFile() && aFileOrFolder.getName().equalsIgnoreCase(filename)) {
                results.add(aFileOrFolder);
            }else if(aFileOrFolder.isDirectory() && aFileOrFolder.canRead()) {
                File[] contents = aFileOrFolder.listFiles();
                fileQueue.addAll(Arrays.asList(contents));

		}
	}
}
}
