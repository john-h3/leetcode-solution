package easy.design.designparkingsystem;

/**
 * DesignParkingSystem
 *
 * @author john 2021/3/2
 */
public class DesignParkingSystem {
  class ParkingSystem {
    private int[] parks = new int[4];

    public ParkingSystem(int big, int medium, int small) {
      parks[1] = big;
      parks[2] = medium;
      parks[3] = small;
    }

    public boolean addCar(int carType) {
      return parks[carType]-- > 0;
    }
  }
}