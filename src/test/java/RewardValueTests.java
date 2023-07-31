import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cash = 10000.0;
        var rewardValue = new RewardValue(cash);
        int actual_miles_value = rewardValue.getMilesValue();
        int expected_miles = 35;
        assertEquals(expected_miles, actual_miles_value);
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 400;
        var rewardValue = new RewardValue(miles);
        double actual_cash_value = rewardValue.getCashValue();
        double expected_cash = 114285.71428571429;
        assertEquals(expected_cash, actual_cash_value);
    }
}
