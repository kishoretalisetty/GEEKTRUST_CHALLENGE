package com.geektrust.backend;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import com.geektrust.backend.factory.CalculatePowerOfGManFactory;

public class App {
	public static void main(String[] args) {
		int srcX=0; int srcY=0; int destX=0; int destY=0;
		Character direction=' ';
		CalculatePowerOfGManFactory gManFactory = new CalculatePowerOfGManFactory();

		try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
			Scanner scanner=new Scanner(fileInputStream);
			while(scanner.hasNextLine()){
				String Input = scanner.nextLine();
				String []arr=Input.split(" ");

				switch (arr[0]) {
					case "SOURCE" :
						srcX=Integer.valueOf(arr[1]);
						srcY=Integer.valueOf(arr[2]);
						direction=arr[3].charAt(0);
						break;
					case "DESTINATION" :
						destX=Integer.valueOf(arr[1]);
						destY=Integer.valueOf(arr[2]);
						break;
					case "PRINT_POWER" :
						gManFactory.getInstance(direction).calcultePower(srcX, srcY, destX, destY);
						break;
					default :
				}
			}
			scanner.close();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
