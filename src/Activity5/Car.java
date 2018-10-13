package Activity5;

import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public  Car(){

    super ();

    Feature[] carFeature = {new InteriorFeature("None"), new ExteriorFeature("none")};
    feature = carFeature;
    carAxle = 2;
  }

  public Car (Date date, String vehicleManufacturer, String vehicleModel, String vehicleMake,
      Chassis vehicleFrame, String vehicleType, Engine vehicleEngine, Feature[] feature, int carAxle){

    super(date,vehicleManufacturer,vehicleModel,vehicleMake,
        vehicleFrame, vehicleType, vehicleEngine);

    this.feature = feature;
    this.carAxle = carAxle;
  }

  public String getInteriorFeature(){

    String seprater = "";

    for (int holder = 0; holder < this.feature.length; holder++) {
      if (this.feature[holder] instanceof InteriorFeature) {
        if (seprater.length() == 0) {
          seprater += this.feature[holder];
        }
        else {
          seprater += "\n  : " + this.feature[holder];
        }
      }
    }
    return seprater;
  }

  public String getExteriorFeatures () {

    String seprater = "";

    for (int holder = 0; holder < this.feature.length; holder++) {
      if (this.feature[holder] instanceof ExteriorFeature) {
        if (seprater.length() == 0) {
          seprater += this.feature[holder];
        }
        else {
          seprater += "\n  : " + this.feature[holder];
        }
      }
    }
    return seprater;
  }

  @Override
  public String toString() {

    String seprater = "";

    for (int holder = 0; holder < this.feature.length; holder++) {
      if (seprater.length() == 0) {
        seprater += this.feature[holder];
      }
      else {
        seprater += "\n  : " + this.feature[holder];
      }
    }
    return super.toString() + "\n" + "Features    : "
        + seprater + "\n" + "Car Axle   : " + carAxle;
  }
}
