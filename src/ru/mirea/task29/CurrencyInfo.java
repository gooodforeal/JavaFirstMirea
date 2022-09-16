package ru.mirea.task29;
import java.io.Serializable;


public class CurrencyInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private final double EURORUB = 60.58;
    private final double USDRUB = 60.60;
    private int amount;
    CurrencyInfo(int amount) {
        this.amount = amount;
    }
    public double getEUROUB() {
        return EURORUB;
    }
    public double getUSDRUB() {
        return USDRUB;
    }
    public int getAmount() {
        return amount;
    }
    public String toString() {
        return "EURO/RUB=" + EURORUB + ", USD/RUB=" + USDRUB + ", amount=" + amount;
    }
}
