package com.geektrust.backend;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import com.geektrust.backend.exception.InvalidCoordinateException;
import com.geektrust.backend.exception.InvalidDirectionException;
import com.geektrust.backend.exception.NoSuchCommandException;
import com.geektrust.backend.factory.CalculatePowerOfGManFactory;
import com.geektrust.backend.service.PowerOfGMan;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to Geektrust Backend Challenge!");
		int sour_x=0; int sour_y=0; int des_x=0; int des_y=0;
		Character direction=' ';
		CalculatePowerOfGManFactory cFactory=new CalculatePowerOfGManFactory();

		try{
			FileInputStream fileInputStream=new FileInputStream(args[0]);
			Scanner scanner=new Scanner(fileInputStream);
			while(scanner.hasNextLine()){
				String Input = scanner.nextLine();
				String []arr=Input.split(" ");
				if(arr[0].equals("SOURCE")){
					sour_x=Integer.valueOf(arr[1]);
					sour_y=Integer.valueOf(arr[2]);
					direction=arr[3].charAt(0);
				}
				else if(arr[0].equals("DESTINATION")){
					des_x=Integer.valueOf(arr[1]);
					des_y=Integer.valueOf(arr[2]);
				}
				else if( arr[0].equals("PRINT_POWER")){
					validCoordinates(sour_x, sour_y, des_x, des_y);
					PowerOfGMan pGman=cFactory.getInstance(direction);
					int answer=pGman.calcultethePowerOfGman(sour_x, sour_y, des_x, des_y);
					System.out.println("POWER "+answer);
				}
			}
			scanner.close();
		}catch( NoSuchCommandException | IOException | InvalidCoordinateException| InvalidDirectionException e){
			e.printStackTrace();
		}
	}

	public static boolean validCoordinates(int sour_x, int sour_y, int des_x, int des_y){
        if(sour_x>=0 
		&& sour_x<7 
		&& sour_y>=0 
		&& sour_y<7 
		&& des_x>=0 
		&& des_x<7 
		&& des_y>=0 
		&& des_y<7){
            return true;
        }
        throw new InvalidCoordinateException();
    }
}
