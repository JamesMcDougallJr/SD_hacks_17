import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import okhttp3.*;
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
                            e.getContent().get(0).getMeasures().getVehicleCount(),e.getContent().get(0).getMeasures().getNumPeds()));
    locationToken=e.getContent.get(0).getLocationUid();
    j=e.getContent().size();
		for (int i = 1; i < j; i++)	{
/**
 * decide whether the locations has a node with this value
 */   int start = i;
      int end = j;
      while( start - 1 <= end - 1) {
        int middle = (start + end) / 2;
        if (locationToken == locations.get(middle)) {
          Node.append(locationToken, data, data, data);
        }
        if(locationToken < locations.get(middle)) {
          end = middle - 1;
        }
        else {
          start = middle + 1;
        }
      } 
      if(locations.contains(locationToken)=false) {
        locations.add(new
                        Node(e.getContent().get(i).getLocationUid(),e.getContent().get(i).getMeasures().getCarSpeed(),
                                e.getContent().get(i).getMeasures().getVehicleCount(),
                                e.getContent().get(i).getMeasures().getNumPeds()));
                                
      }
			e.getContent().get(i);
		}
		
		System.out.println(e);
		
	}

	ArrayList <Node> sortDangerLevel()	{ 
		//insert sorting algorithm by descending order

			 if (locations.get(locations.size()/2) !=  locationToken ) {
       

			  // Node.append(speed, number of cars, number of peds);
		     return null;
	     }
     }
}
