/**
 * James McDougall
 * this class defines what a node is in our program
 */
public class Node {
  private double count;
  private double carSpeed;
  private double pedSpeed;
  private double carNum;
  private double pedNum;
  private String ID;
  
  private double dangerFactor;
  private String dangerString;
 
  
  /**
   * Default constructor takes as formal arguments the speed of cars, number of cars, and the number of pedestrians.
   */
  public Node(String ID, double carSpeed, double pedSpeed, double carNum, double pedNum) { 
	  this.ID = ID;
	  this.carSpeed = carSpeed;
	  this.pedSpeed = pedSpeed;
	  this.carNum = carNum;
	  this.pedNum = pedNum;
	  this.count = 1;
  }
  
  private void append(double carSpeed, double numCars, double numPeds) {
    this.count++;
    this.carSpeed+=carSpeed;
    this.pedNum+=numPeds;
    this.carNum+=numCars;
  }
  
  private void computeDangerFactor() {
    this.carSpeed /= this.count;
    this.pedNum /= this.count;
    this.carNum /= this.count;
    
    double pedToCarRatio= pedNum/carNum;
    this.dangerFactor = (this.carSpeed/10) * pedToCarRatio; //The equation is derived from the fact that the higher the ratio of people to cars, the more likely it is for a person to be injured. Additionally, the speed at which the cars are going decreases their ability to stop which increases the risk factor.
    
    if(pedToCarRatio > 1 && carSpeed > 50) {
    	dangerString = "Really Dangerous";
    }
		else if (pedToCarRatio > 1 || carSpeed > 50){
			dangerString = "Dangerous";
		}
		else if ((pedToCarRatio < 1 && pedToCarRatio > 0.5) || carSpeed > 35){
			dangerString = "Mildly Dangerous";
		}
		else{
			dangerString = "Safe";
		}
	return;
  }
} //end of class definition
