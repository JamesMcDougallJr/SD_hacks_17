import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

import com.google.gson.Gson;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataRequest dr = new DataRequest();
		
		ArrayList <Node> locations = new ArrayList <Node>();
		
		Gson gson = new Gson();
		Event e = gson.fromJson(dr.getPedestrianData(0), Event.class);
		locations.add(new Node(e.getContent().get(0).getLocationUid(), e.getContent().get(0).getMeasures().getCarSpeed());
		for (int i = 1; i < e.getContent().size(); i++)	{
			if () 
			e.getContent().get(i)
		}
		
		System.out.println(e);
		
	}

	
	ArrayList <Node> sortDangerLevel()	{ 
		//insert sorting algorithm by descending order
		return null;
	}
}
