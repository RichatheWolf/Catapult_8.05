public class Catapult{
	private double velocity;
	private double degrees;
	private double distance;
	public Catapult(){
	
	}
	public Catapult(double v, double deg){
		velocity = v;
		degrees = deg;
		distance = 0;
	}
	public double getVelocity(){
		return velocity;
	}
	public void setVelocity(double v){
		velocity = v;
	}
	public double getDegrees(){
		return degrees;
	}
	public void setDegrees(double deg){
		degrees = deg;
	}
	public double getDistance(){
		return distance;
	}
	public void setDistance(double dis){
		distance = dis;
	}
	public double calcDistance(int velocity, int degrees){
		distance = ((Math.pow(velocity, 2) * Math.sin(2 *
		Math.toRadians(degrees)) / 9.8) * 3.2808);
		return distance;
	}
}
