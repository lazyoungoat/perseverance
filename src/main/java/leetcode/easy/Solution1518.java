package leetcode.easy;

public class Solution1518 {
    public int numWaterBottles(int numBottles, int numExchange){
        int maximum = numBottles;
        while(numBottles >= numExchange){
           int exchangeBottles = numBottles / numExchange;
           int leftBottles = numBottles % numExchange;
           numBottles = exchangeBottles + leftBottles;
           maximum += exchangeBottles;
        }
        return maximum;
    }
}
