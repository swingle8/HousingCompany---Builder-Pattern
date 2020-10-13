package House;

import HouseType.HouseTypes;
import HouseType.HouseTypes.HouseTypeBuilder;

public class Main {
	public static void main (String [] args) {
		HouseTypes.HouseTypeBuilder build = new HouseTypes.HouseTypeBuilder(false, 0, false, 0);
		build.setBalcony(true);
		HouseTypes house = build.create();
		
		System.out.println(house.balcony);
		
	}
}
