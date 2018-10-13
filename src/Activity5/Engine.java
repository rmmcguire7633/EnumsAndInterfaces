package Activity5;

import java.util.Date;

public interface Engine {

  //adding the required defintions
  void setEngineCylinders(int engineCylinders);
  void setEngineManufacturedDate(Date date);
  void setEngineManufacturer(String manufacturer);
  void setEngineMake(String engineMake);
  void setEngineModel(String engineModel);
  void setDriveTrain(String driveTrain);
  void setEngineType(String fuel);
}
