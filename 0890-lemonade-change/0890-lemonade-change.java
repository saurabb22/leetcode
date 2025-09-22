class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0; // need denomination tracking in addition to collect
        int collect = 0;
        
        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5){
                five++;
                collect += 5;
            }else if(bills[i] == 10){
                if(five == 0) return false;
                five--;
                ten++;
                collect += 10;
            }else{ // bill == 20
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                    collect += 20;
                }else if(five >= 3){
                    five -= 3;
                    collect += 20;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}