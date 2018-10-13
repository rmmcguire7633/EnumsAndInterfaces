package Activity5;

import java.util.Date;


public class Main {
  public static void main(String[] args) {

    Car car1 = new Car();
    System.out.println(car1);

    System.out.println("____________________");

    Feature [] feature = { new InteriorFeature("AM/FM Radio")
        , new ExteriorFeature("Wood Panels")
        , new InteriorFeature("Air Conditioning")
        , new ExteriorFeature("Moonroof")};

    Car car2 = new Car(new Date(System.currentTimeMillis()), "Honda", "Prelude", "Honda"
        , new VehicleChassis("Unibody"), "Coupe"
        , new ManufacturedEngine ("Honda", "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKI")
        , feature, 2);
    System.out.println(car2);
  }
}
