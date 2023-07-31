public class RewardValue {
    // two constructors: one that accepts a cash value and one that accepts a value in miles
    public double cash_value;
    public int miles;
    public double rate = 0.0035; //miles to cash rate

    public RewardValue(double cash_value) { //constructor number one -- cash to miles
        this.cash_value = cash_value;
        this.miles = (int)(cash_value * rate);
    }

    public RewardValue(int miles) { //constructor number two -- miles to cash
        this.miles = miles;
        this.cash_value = miles / rate;
    }

//    RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
    public double getCashValue(){
        return cash_value;
    }
//    RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
    public int getMilesValue(){
        return miles;
    }
//    RewardValue must convert from miles to cash at a rate of 0.0035.
}
