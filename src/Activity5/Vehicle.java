package Activity5;

import java.util.Date;

public class Vehicle implements Engine, Chassis {

  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private Engine vehicleEngine;

  public Vehicle() {

    vehicleManufacturedDate = new Date(System.currentTimeMillis());
    vehicleManufacturer = "Generic";
    vehicleMake = "Generic";
    vehicleModel = "Generic";
    vehicleType = "None";
    vehicleFrame = new VehicleFrame();
    vehicleType = "None";
    vehicleEngine = new ManufacturedEngine();
    vehicleEngine.setEngineType("88 AKI");
    vehicleEngine.setDriveTrain("2Wd: Two-Wheel Drive");
  }

  public Vehicle (Date date, String vehicleManufacturer, String vehicleModel, String vehicleMake,
      Chassis vehicleFrame, String vehicleType, Engine vehicleEngine) {

    this.vehicleManufacturedDate = date;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.vehicleEngine = vehicleEngine;
  }


  @Override
  public Chassis getChassisType() {

    return vehicleFrame;
  }

  @Override
  public void setChassisType(String vehicleChassis) {

    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {

    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {

    vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

    this.vehicleManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {

    this.vehicleEngine.setEngineMake(engineMake);
  }

  @Override
  public void setEngineModel(String engineModel) {

    this.vehicleEngine.setEngineModel(engineModel);
  }

  @Override
  public void setDriveTrain(String driveTrain) {

    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  @Override
  public void setEngineType(String fuel) {

    this.vehicleEngine.setEngineType(fuel);
  }

  @Override
  public String toString() {

    return "Manufacturer Name " + this.vehicleManufacturer + "\n"
        + "Manufacturer Date " + this.vehicleManufacturedDate.toString() + "\n"
        + "Vehicle Make " + this.vehicleMake + "\n"
        + "Vehicle Model " + this.vehicleModel + "\n"
        + "Vehicle Type " + this.vehicleType + "\n"
        + vehicleEngine.toString();
  }
}
