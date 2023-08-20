package com.geektrust.backend;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import com.geektrust.backend.factory.InputOperationInvoker;
import com.geektrust.backend.request.Request;

public class App {

	public static void main(String[] args) {
		Request request = new Request();
		InputOperationInvoker invoker = new InputOperationInvoker();

		try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
			Scanner scanner=new Scanner(fileInputStream);
			while(scanner.hasNextLine()){
				String Input = scanner.nextLine();
				String []arr=Input.split(" ");
				invoker.getInstance(arr[0]).apply(request, arr);
			}
			scanner.close();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
