import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("locationUid")
    @Expose
    private String locationUid;
    @SerializedName("assetUid")
    @Expose
    private String assetUid;
    @SerializedName("eventType")
    @Expose
    private String eventType;
//    @SerializedName("timestamp")
//    @Expose
//    private Integer timestamp;
//    @SerializedName("properties")
//    @Expose
//    private Properties properties;
    @SerializedName("measures")
    @Expose
    private Measures measures;

    public String getLocationUid() {
        return locationUid;
    }

    public void setLocationUid(String locationUid) {
        this.locationUid = locationUid;
    }

    public String getAssetUid() {
        return assetUid;
    }

    public void setAssetUid(String assetUid) {
        this.assetUid = assetUid;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

//    public Integer getTimestamp() {
//        return timestamp;
//    }
//
//    public void setTimestamp(Integer timestamp) {
//        this.timestamp = timestamp;
//    }

//    public Properties getProperties() {
//        return properties;
//    }
//
//    public void setProperties(Properties properties) {
//        this.properties = properties;
//    }

    public Measures getMeasures() {
        return measures;
    }

    public void setMeasures(Measures measures) {
        this.measures = measures;
    }

}
