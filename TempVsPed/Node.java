/**
 * James McDougall
 * this class defines what a node is in our program
 */
public class Node {
  private double countAppend;
  private double totalSpeed;
  private double totalCars;
	private double totalPeds;
  private static String ID;
  private static String previousID;
  /**
   * Default constructor takes as formal arguments the speed of cars, number of cars, and the number of pedestrians.
   */
  public Node(String ID, double speedOfCar, double numCars, double numPeds) { 
		countAppend++;
		totalSpeed=speedOfCar;
		totalPeds=numPeds;
		totalCars=numCars;
  }
  private void append(double speedOfCar, double numCars, double numPeds) {
    countAppend++;
    totalSpeed+=speedOfCar;
    totalPeds+=numPeds;
    totalCars+=numCars;
  }
  private double computeDangerScore() {
    totalSpeed/=countAppend;
    totalPeds/=countAppend;
    totalCars/=countAppend;
    double pedToCarRatio= totalPeds/totalCars;
    double dangerFactor=(totalSpeed/10) * pedToCarRatio; //The equation is derived from the fact that the higher the ratio of people to cars, the more likely it is for a person to be injured. Additionally, the speed at which the cars are going decreases their ability to stop which increases the risk factor.
    System.out.println("Pedestrian to Car Ratio: " + pedToCarRatio);
    System.out.println("Average Total Speed: " + totalSpeed);
    System.out.println("Calculated Danger Factor: " +  dangerFactor);
		if(totalSpeed/10 > 50 && pedToCarRatio > 1) {
			System.out.println("This is a dangerous intersection");
		}
		else if(totalSpeed/10 > 50 && pedToCarRatio < 1) {
			System.out.println("This is a busy road that people usually stay off of");
		}
		else if(totalSpeed/10 < 30 && pedToCarRatio < 1) {
			System.out.println("This road isn't used much");
		}
		else if(totalSpeed/10 < 30 && pedToCarRatio > 1) {
			System.out.println("This is a safe buy busy road");
		}
  }
} //end of class definition
