import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

import com.google.gson.Gson;

public class main {
private static String locationToken;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataRequest dr = new DataRequest();
		
		ArrayList <Node> locations = new ArrayList <Node>();
		
		Gson gson = new Gson();
		Event e = gson.fromJson(dr.getPedestrianData(0), Event.class);
		locations.add(new Node(e.getContent().get(0).getLocationUid(),
                            e.getContent().get(0).getMeasures().getCarSpeed(),
                            e.getContent().get(0).getMeasures().getVehicleCount(),e.getContent().get(0).getMeasures().getNumPeds());
    locationToken=e.getContent.get(0).getLocationUid();
		for (int i = 1; i < e.getContent().size(); i++)	{
/**
 * decide whether the locations has a node with this value
 */   
      if(locations.contains(locationToken) {
        Node.append(speedofcar, numcars , numpeds);
      }
         
			e.getContent().get(i)
		}
		
		System.out.println(e);
		
	}

	
	ArrayList <Node> sortDangerLevel()	{ 
		//insert sorting algorithm by descending order

			 if (locations.get(locations.size()/2) !=     ) {

			   Node.append(speed, number of cars, number of peds);
		return null;
	}
}
