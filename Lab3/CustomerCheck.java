package Lab3;

import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        /* to be implemented in part (a) */
        double total = 0;
        for (MenuItem one : check) {
            total += one.getPrice();
        }
        return total;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        /* to be implemented in part (b) */
        for (MenuItem one : check) {
            if (one.isDailySpecial() || totalPrices() < 40) {
                return false;
            }        
        }
        return true;
    }
    
    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        /* to be implemented in part (c) */
        double origCost = totalPrices();
        double totalCost = totalPrices();
        if (couponApplies()) {
            totalCost -= totalCost * 0.25;
        }

        int people = 0;
        for (MenuItem one : check) {
            if (one.isEntree()) {
                people ++;
            }
        }

        if (people >= 6) {
            totalCost += origCost * 0.20;
        }

        return totalCost;
    }

}