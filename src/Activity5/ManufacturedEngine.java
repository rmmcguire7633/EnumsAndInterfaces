package Activity5;

import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  public ManufacturedEngine () {

    engineManufacturer = "Generic";
    engineManufacturedDate = new Date(System.currentTimeMillis());
    engineMake = "Generic";
    engineModel = "Generic";
    engineType = "85 AKI";
    engineCylinders = 0;
    driveTrain = "2WD: Two-Wheel Drives";

  }

  public ManufacturedEngine (String make, String model, String engineModel, String driveTrain, int engineCylinders, String engineTypes) {

    engineManufacturer = model;
    engineManufacturedDate = new Date(System.currentTimeMillis());
    engineMake = make;
    this.engineModel = engineModel;
    this.engineType = engineTypes;
    this.engineCylinders = engineCylinders;
    this.driveTrain = driveTrain;

  }

  @Override
  public void setEngineCylinders(int engineCylinders) {

    this.engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {

    this.engineManufacturedDate = date;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

    this.engineManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {

    this.engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {

    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {

    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String fuel) {

    this.engineType = fuel;
  }

  @Override
  public String toString() {

    return "Engine Manufacturer : " + engineManufacturer + " \n"
        + "Engine Manufactured : " + engineManufacturedDate + " \n"
        + "Engine Make : " + engineMake + " \n"
        + "Engine Model : " + engineModel + "\n"
        + "Engine Type : " + engineType + "\n"
        + "Engine Cylinders : " + engineCylinders + "\n"
        + "Drive Train : " + driveTrain;
  }
}
