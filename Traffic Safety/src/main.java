import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

import com.google.gson.Gson;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Reader reader = new FileReader("pedestrian.json");
			Gson gson = new Gson();
			Event e = gson.fromJson(reader, Event.class);
			System.out.println(e);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	void computeDanger(/*insert parameters*/)	{
		//insert algorithm
	}
	
	ArrayList <Node> sortDangerLevel()	{ 
		//insert sorting algorithm by descending order
		return null;
	}
}
