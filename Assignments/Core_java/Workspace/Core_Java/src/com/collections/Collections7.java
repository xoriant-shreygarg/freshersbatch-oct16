package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Parked_CarOwner_Details {
	private String ownerName;
	private String carModel;
	private String carNO;
	private long ownerMobileNo;
	private String ownerAddress;
	private ParkingLocation token;

	public Parked_CarOwner_Details(String ownerName, String carModel, String carNO, long ownerMobileNo,
			String ownerAddress, ParkingLocation token) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
		this.token = token;
	}

	public ParkingLocation getToken() {
		return token;
	}

	public void setToken(ParkingLocation token) {
		this.token = token;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarNO() {
		return carNO;
	}

	public void setCarNO(String carNO) {
		this.carNO = carNO;
	}

	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public void setOwnerMobileNo(long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	@Override
	public String toString() {
		return "Parked_CarOwner_Details [ownerName=" + ownerName + ", carModel=" + carModel + ", carNO=" + carNO
				+ ", ownerMobileNo=" + ownerMobileNo + ", ownerAddress=" + ownerAddress + ", token=" + token + "]";
	}

}

class Parked_CarOwnerList {

	public String add_new_car(Parked_CarOwner_Details obj) {
		return ""; // token
	}

	public void remove_car() {

	}

	public String get_parked_car_location(String token) {
		return "";
	}
}

class ParkingLocation {

	private String number;
	private boolean occupied;

	public ParkingLocation(String number, boolean occupied) {
		super();
		this.number = number;
		this.occupied = occupied;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	@Override
	public String toString() {
		return "ParkingLocation [number=" + number + ", occupied=" + occupied + "]";
	}

}

public class Collections7 {

	static ArrayList<ParkingLocation> vacantParkingLocations;

	static {
		vacantParkingLocations = new ArrayList<>();
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 20; k++) {
					char c = 0;
					switch (j) {
					case 1:
						c = 'A';
						break;
					case 2:
						c = 'B';
						break;
					case 3:
						c = 'C';
						break;
					case 4:
						c = 'D';
						break;
					}
					String str = String.valueOf(k);
					if (str.length() == 1) {
						str = String.valueOf(0) + str;
					}
					vacantParkingLocations.add(new ParkingLocation(String.valueOf(i) + String.valueOf(c) + str, false));
				}
			}
		}
	}

	public static ParkingLocation getNearestEmptyParkingLocation() {
		sortParkingLocations();
		for (ParkingLocation location : vacantParkingLocations) {
			if (!location.isOccupied()) {
				location.setOccupied(true);
				return location;
			}
		}
		return null;
	}

	public static void sortParkingLocations() {
		Collections.sort(vacantParkingLocations, new Comparator<ParkingLocation>() {
			@Override
			public int compare(ParkingLocation o1, ParkingLocation o2) {
				return o1.getNumber().compareTo(o2.getNumber());
			}
		});
	}

	static HashMap<Integer, HashMap<Character, HashMap<Integer, Parked_CarOwner_Details>>> hashMap1 = new HashMap<>();

	public static Parked_CarOwner_Details getParkedCarDetails(String token) {
		Integer floor = Integer.parseInt(token.substring(0, 1));
		Character section = token.charAt(1);
		Integer slotNumber = Integer.parseInt(token.substring(2, 4));
		return hashMap1.get(floor).get(section).get(slotNumber);
	}

	private static void listAllParkedCars() {
		Iterator<Integer> i1 = hashMap1.keySet().iterator();
		while(i1.hasNext()){
			Integer i1Key = i1.next();
			Iterator<Character> i2 = hashMap1.get(i1Key).keySet().iterator();	
			while(i2.hasNext()){
				Character i2Key = i2.next();
				Iterator<Integer> i3 = hashMap1.get(i1Key).get(i2Key).keySet().iterator();
				while(i3.hasNext()){
					System.out.println(hashMap1.get(i1Key).get(i2Key).get(i3.next()));
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char choice = 'X';
		do {
			System.out.println("\n\nA) Add car\nB) Remove car\nC) Get parked car location\n"
					+ "D) List all parked cars\n" + "Please enter your option : \n");
			String choiceString = sc.next();
			if (choiceString.length() == 1)
				choice = choiceString.charAt(0);
			else
				choice = 'X';
			switch (choice) {
			case 'A':
				ParkingLocation location = getNearestEmptyParkingLocation();
				if (location != null) {
					System.out.println("Enter ownerName,  carModel, carNO, ownerMobileNo, ownerAddress : ");
					String ownerName = sc.next();
					String carModel = sc.next();
					String carNO = sc.next();
					Long ownerMobileNo = Long.parseLong(sc.next());
					String ownerAddress = sc.next();
					Parked_CarOwner_Details details = new Parked_CarOwner_Details(ownerName, carModel, carNO,
							ownerMobileNo, ownerAddress, location);
					Integer floor = Integer.parseInt(String.valueOf(location.getNumber().charAt(0)));
					Character section = location.getNumber().charAt(1);
					Integer slotNumber = Integer.parseInt(String.valueOf(location.getNumber().substring(2, 4)));
					if (!hashMap1.containsKey(floor)) {
						hashMap1.put(floor, new HashMap<Character, HashMap<Integer, Parked_CarOwner_Details>>() {
							{
								put(section, new HashMap<Integer, Parked_CarOwner_Details>() {
									{
										put(slotNumber, details);
									}
								});
							}
						});
					} else {
						if (!hashMap1.get(floor).containsKey(section)) {
							hashMap1.get(floor).put(section, new HashMap<Integer, Parked_CarOwner_Details>() {
								{
									put(slotNumber, details);
								}
							});
						} else {
							hashMap1.get(floor).get(section).put(slotNumber, details);
						}
					}
					System.out.println("Token : " + location.getNumber());
				} else {
					System.out.println("Parking is full.");
				}
				break;
			case 'B':
				System.out.println("Enter token : ");
				String token = sc.next();
				Integer floor = Integer.parseInt(String.valueOf(token.charAt(0)));
				Character section = token.charAt(1);
				Integer slotNumber = Integer.parseInt(String.valueOf(token.substring(2, 4)));
				Parked_CarOwner_Details details = getParkedCarDetails(token);
				hashMap1.get(floor).get(section).remove(slotNumber);
				details.getToken().setOccupied(false);
				System.out.println(details);
				System.out.println("Car removed");
				break;
			case 'C':
				System.out.println("Enter token : ");
				token = sc.next();
				details = getParkedCarDetails(token);
				System.out.println(details);
				break;
			case 'D':
				listAllParkedCars();
				break;
			}
		} while (choice == 'A' || choice == 'B' || choice == 'C' || choice == 'D');

	}

}