package com.geektrust.backend;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import com.geektrust.backend.constant.AppConstant;
import com.geektrust.backend.factory.CalculatePowerOfGManFactory;
import com.geektrust.backend.request.Request;

public class App {

	public static void main(String[] args) {
		Request request = new Request();

		try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
			Scanner scanner=new Scanner(fileInputStream);
			while(scanner.hasNextLine()){
				String Input = scanner.nextLine();
				String []arr=Input.split(" ");
				processInput(arr,request);
			}
			scanner.close();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void processInput(String[] inputs, Request request) {
		String cmd = inputs[0];
		switch (cmd) {
			case AppConstant.CMD_SOURCE :
				request.setSrcX(Integer.valueOf(inputs[1]));
				request.setSrcY(Integer.valueOf(inputs[2]));
				request.setDirection(inputs[3].charAt(0));
				break;
			case AppConstant.CMD_DEST :
				request.setDestX(Integer.valueOf(inputs[1]));
				request.setDestY(Integer.valueOf(inputs[2]));
				break;
			case AppConstant.CMD_PRINT_POWER :
				new CalculatePowerOfGManFactory().getInstance(request.getDirection())
						.calculatePower(request.getSrcX(),
						request.getSrcY(),
						request.getDestX(),
						request.getDestY());
				break;
			default :
		}

	}
	
}
