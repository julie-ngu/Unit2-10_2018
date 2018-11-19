/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Main file for Vehicle program (calls variables, etc. from Vehicle file and
 * 		gets input from user)
 *
 ****************************************************************************/

import java.util.Scanner;

public class MyVehicle {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int maxVehicles = 2;
		int counter = 0;
		int userWheels = 0;
		
		do {
			counter ++;
			
			if(counter > maxVehicles) {
				break;
			}
			else {
				System.out.print("Enter the license plate number of vehicle " + counter + ": ");
				if(userInput.hasNextLine()) {
					String userPlate = userInput.nextLine();
					
					System.out.print("Enter the colour of vehicle " + counter + ": ");
					if(userInput.hasNextLine()) {
						String userColour = userInput.nextLine();	
						
						System.out.print("For vehicle " +  counter + ", would you like a truck or a bike? ");
						if(userInput.hasNextLine()) {
							String choice = userInput.nextLine();
							
							if(choice.equalsIgnoreCase("bike")) {
								userWheels = 2;
								Bike myBike = new Bike(userPlate, userColour);
								myBike.setWheels(userWheels);
								
								System.out.print("Enter speed increment of vehicle " + counter + " (accelerate): ");
								if(userInput.hasNextInt()) {
									int increase = userInput.nextInt();
									myBike.accelerate(increase);
									
									System.out.print("Enter speed decrement of vehicle " + counter + " (brake): ");
									if(userInput.hasNextInt()) {
										int decrease = userInput.nextInt();
										myBike.brake(decrease);
										
										System.out.print("\n\nVehicle " + counter + "\nType: " + choice + "\nLicense: " + myBike.getLicense() + "\nColour: " + myBike.getColour() + "\nMax Speed: " + myBike.getMax() + "\nSpeed: " + myBike.getSpeed() + "\n\n");
										userInput.nextLine();
									}
									else {
										System.out.print("\nError: Illegal Input");
										break;
									}
								}
								else {
									System.out.print("\nError: Illegal Input");
									break;
								}
							}
							else if(choice.equalsIgnoreCase("truck")) {
								System.out.print("How many doors for vehicle " + counter + "? ");
								if(userInput.hasNextInt()) {
									int userDoors = userInput.nextInt();
									
									if(userDoors > 0) {
										System.out.print("How many wheels for vehicle " + counter + "? ");
										if(userInput.hasNextInt()) {
											userWheels = userInput.nextInt();
											
											Truck myTruck = new Truck(userPlate, userColour, userDoors, userWheels);
											
											myTruck.setWheels(userWheels);
											
											if(myTruck.getWheels() == -1) {
												System.out.print("\nError");
												break;
											}
											else {
												System.out.print("Enter speed increment of vehicle " + counter + " (accelerate): ");
												if(userInput.hasNextInt()) {
													int increase = userInput.nextInt();
													if(increase >= 0) {
														myTruck.accelerate(increase);
														
														System.out.print("Enter speed decrement of vehicle " + counter + " (brake): ");
														if(userInput.hasNextInt()) {
															int decrease = userInput.nextInt();
															if(decrease >= 0) {
																myTruck.brake(decrease);
																
																System.out.print("\n\nVehicle " + counter + "\nType: " + choice + "\nLicense: " + myTruck.getLicense() + "\nColour: " + myTruck.getColour() + "\nNumber of Doors: " + myTruck.getDoors() + "\nNumber of Wheels: " + myTruck.getWheels() + "\nMax Speed: "  + myTruck.getMax() + "\nSpeed: " + myTruck.getSpeed() + "\n\n");
																userInput.nextLine();
															}
															else {
																System.out.print("\nError: Illegal Input");
																break;
															}
														}
														else {
															System.out.print("\nError: Illegal Input");
															break;
														}
													}
													else {
														System.out.print("\nError: Illegal Input");
														break;
													}
												}
												else {
													System.out.print("\nError: Illegal Input");
													break;
												}
											}
										}									
										else {
											System.out.print("\nError: Illegal Input");
											break;
										}
									}
									else {
										System.out.print("\nError: Illegal Input");
										break;
									}
								} 
								else {
									System.out.print("\nError: Illegal Input");
									break;
								}
							}
							else {
								System.out.print("\nError: Illegal Input");
								break;
							}
						}
						else {
							System.out.print("\nError: Illegal Input");
							break;
						}
					}
					else {
						System.out.print("\nError: Illegal Input");
						break;
					}
				}
				else {
					System.out.print("\nError: Illegal Input");
					break;
				}
			}
		} while(true);
	}
}
