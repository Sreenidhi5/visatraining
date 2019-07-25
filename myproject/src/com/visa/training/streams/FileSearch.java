package com.visa.training.streams;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FileSearch {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String filename= args[0];
		String foldername = args[1];
		File folder= new File(foldername);
		File[] contents = folder.listFiles();
		Queue<File> fileQueue= new LinkedList<File>();
		fileQueue.addAll(Arrays.asList(contents));
		List<File>results= new ArrayList<>();
		
		SearchWorker w1 = new SearchWorker(filename,fileQueue,results);
		SearchWorker w2 = new SearchWorker(filename,fileQueue,results);
		SearchWorker w3 = new SearchWorker(filename,fileQueue,results);
		SearchWorker w4 = new SearchWorker(filename,fileQueue,results);
		
		w1.start(); w2.start();w3.start();w4.start();
		w1.join();		w2.join();		w3.join();	w4.join();
        System.out.println("There were "+results.size()+" matches found.");
        results.forEach(f->System.out.println(f.getAbsolutePath()));

		

		




	}

}
