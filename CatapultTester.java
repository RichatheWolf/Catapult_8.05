public class CatapultTester{
	public static void main(String[] args){
		Catapult catapult = new Catapult();
		int [] speeds = {20, 25, 30, 35, 40, 45, 50};
		int [] angles = {25, 30, 35, 40, 45, 50, 55};
		double [][] catapults = new double[7][7];
		System.out.println("\t\tProjectile Distance (feet)");
		System.out.println("MPH25 deg30 deg35 deg40 deg45 deg50 deg");
		System.out.print("==================================================================");
		for( int row = 0; row < catapults.length; row++){
			System.out.println("");
			System.out.printf("%2d", speeds[row]);
			for(int col = 0; col < 6; col++){
				catapults[row][col] = catapult.calcDistance(speeds[row],angles[col]);
				System.out.printf("%10.1f", catapults[row][col]);
			}
		}
	}
}