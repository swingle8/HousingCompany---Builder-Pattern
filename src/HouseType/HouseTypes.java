package HouseType;

public class HouseTypes {
	public boolean bricks;
	public int rooms;
	public int washrooms;
	public boolean roof;
	
	
	public boolean balcony;
	public boolean swimmingPool;
	public boolean garden;
	public boolean carPark;
	
	private HouseTypes(HouseTypeBuilder build) {
		this.bricks = build.bricks;
		this.rooms = build.rooms;
		this.roof = build.roof;
		this.washrooms = build.washrooms;
		this.balcony = build.balcony;
		this.swimmingPool = build.swimmingPool;
		this.garden = build.garden;
		this.carPark = build.carPark;
	}
	
	public static class HouseTypeBuilder {
		private boolean bricks;
		private int rooms;
		private boolean balcony = false;
		private boolean swimmingPool = false;
		private boolean garden = false;
		private boolean carPark = false;
		private boolean roof;
		private int washrooms;
		
		public HouseTypeBuilder (boolean bricks, int rooms, boolean roof, int washrooms) {
			this.bricks = bricks;
			this.rooms = rooms;
			this.roof = roof;
			this.washrooms = washrooms;
		}
		
		public HouseTypes create () {
			return new HouseTypes(this);
		}

		public boolean isBricks() {
			return bricks;
		}

		public void setBricks(boolean bricks) {
			this.bricks = bricks;
		}

		public int getRooms() {
			return rooms;
		}

		public void setRooms(int rooms) {
			this.rooms = rooms;
		}

		public int getWashrooms() {
			return washrooms;
		}

		public void setWashrooms(int washrooms) {
			this.washrooms = washrooms;
		}

		public boolean isRoof() {
			return roof;
		}

		public void setRoof(boolean roof) {
			this.roof = roof;
		}

		public boolean isBalcony() {
			return balcony;
		}

		public void setBalcony(boolean balcony) {
			this.balcony = balcony;
		}

		public boolean isSwimmingPool() {
			return swimmingPool;
		}

		public void setSwimmingPool(boolean swimmingPool) {
			this.swimmingPool = swimmingPool;
		}

		public boolean isGarden() {
			return garden;
		}

		public void setGarden(boolean garden) {
			this.garden = garden;
		}

		public boolean isCarPark() {
			return carPark;
		}

		public void setCarPark(boolean carPark) {
			this.carPark = carPark;
		}

	}
	
}
