package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
//    You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
//    Return the fewest number of coins that you need to make up that amount.
//    If that amount of money cannot be made up by any combination of the coins, return -1.
//    You may assume that you have an infinite number of each kind of coin.

//    Example 1:
//    Input: coins = [1,2,5], amount = 11
//    Output: 3
//    Explanation: 11 = 5 + 5 + 1
    public int coinChange(int[] coins, int amount) {
        if(amount ==1){
            return 0;
        }
        int[] sortedCoins = coinsSort(coins);
        int count=0;

        for(int i=0; i<coins.length; i++){
            while(amount>=sortedCoins[i]) {
                amount = subtractAmount(amount, sortedCoins[i]);
                count++;
            }
            if(amount ==0){
                return count;
            }
            for(int k=i+1; k<coins.length; k++){
                if(amount==sortedCoins[k]){
                    count++;
                    return count;
                }
            }
        }


        return -1;
    }
    public int subtractAmount(int amount, int coinsNumber){
        return amount-coinsNumber;
    }
    public int[] coinsSort(int[] coins){
        boolean notSorted = true;

        while (notSorted){
            notSorted = false;
            for(int i=0; i<coins.length-1; i++){
                if(coins[i]<coins[i+1]){
                    int temp = coins[i];
                    coins[i]= coins[i+1];
                    coins[i+1] = temp;
                    notSorted = true;
                }
            }
        }
        return coins;
    }
}
