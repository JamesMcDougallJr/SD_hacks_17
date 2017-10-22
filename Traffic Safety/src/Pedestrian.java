import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Expose;

public class Pedestrian{
	@SerializedName("pedestrianCount")
	@Expose
	private Integer pedestrianCount;
	@SerializedName("locationUid")
	@Expose
	private String locationUid;
	
	public int getPedestrianCount(){
		return pedestrianCount;
	}
	public void setPedestrianCount(int pedestrianCount){
		this.pedestrianCount = pedestrianCount;
	}

	public String getLocationUid(){
		return locationUid;
	}	
	public void setLocationUid(String locationUid){
		this.locationUid = locationUid;
	}

}
