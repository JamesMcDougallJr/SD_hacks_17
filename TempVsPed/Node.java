/**
 * James McDougall
 * this class defines what a node is in our program
 */
public class Node {
  public static double countAppend;
  public static double totalSpeed;
  public static double totalCars;
  public static String ID;
  public static String previousID;
  /**
   * Default constructor takes as formal arguments the speed of cars, number of cars, and the number of pedestrians.
   */
  public Node(String ID) {  }
  public boolean Node(String ID) {
    //this function will return true if the previous ID hasn't changed,
    //indicating that the node isn't new and should be appended
    if(ID==previousID) {
       return true;
    }
    else {
      return false;
    }
  }
  public void appendToNode(double speedOfCar, double numCars, double numPeds) {
    countAppend++;
    totalSpeed+=speedOfCar;
    totalPeds+=numPeds;
    totalCars+=numCars;
  }

} //end of class definition
