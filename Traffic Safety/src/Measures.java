import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Measures {

//    @SerializedName("counter_direction")
//    @Expose
//    private Integer counterDirection;
    @SerializedName("counter_direction_speed")
    @Expose
    private Double counterDirectionSpeed;
    @SerializedName("counter_direction_vehicleCount")
    @Expose
    private Integer counterDirectionVehicleCount;
//    @SerializedName("direction")
//    @Expose
//    private Integer direction;
    @SerializedName("speed")
    @Expose
    private Double speed;
    @SerializedName("vehicleCount")
    @Expose
    private Integer vehicleCount;

//    public Integer getCounterDirection() {
//        return counterDirection;
//    }
//
//    public void setCounterDirection(Integer counterDirection) {
//        this.counterDirection = counterDirection;
//    }

    public Double getCounterDirectionSpeed() {
        return counterDirectionSpeed;
    }

    public void setCounterDirectionSpeed(Double counterDirectionSpeed) {
        this.counterDirectionSpeed = counterDirectionSpeed;
    }

    public Integer getCounterDirectionVehicleCount() {
        return counterDirectionVehicleCount;
    }

    public void setCounterDirectionVehicleCount(Integer counterDirectionVehicleCount) {
        this.counterDirectionVehicleCount = counterDirectionVehicleCount;
    }

//    public Integer getDirection() {
//        return direction;
//    }
//
//    public void setDirection(Integer direction) {
//        this.direction = direction;
//    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(Integer vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

}
