package Activity5;

public class VehicleChassis implements Chassis{

  String chassisName;

  public VehicleChassis() {

    this.chassisName = Chassis.CHASSIS;
  }

  public VehicleChassis (String chassisName) {

    this.chassisName = chassisName;
  }

  public Chassis getChassisType(){

    return this;
  }

  public void setChassisType(String vehichleChassis) {

    this.chassisName = vehichleChassis;
  }

  @Override
  public String toString() {

    return "Chassis Name :" + chassisName;
  }
}
