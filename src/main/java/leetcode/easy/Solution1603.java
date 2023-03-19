package leetcode.easy;

public class Solution1603 {
    int big;
    int medium;
    int small;

    public Solution1603(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if ((big >= 1) && (carType == 1)) {
            big--;
            return true;
        } else if ((medium >= 1) && (carType == 2)) {
            medium--;
            return true;
        } else if ((small >= 1) && (carType == 3)) {
            small--;
            return true;
        }else {
            return false;
        }
    }
}
/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
