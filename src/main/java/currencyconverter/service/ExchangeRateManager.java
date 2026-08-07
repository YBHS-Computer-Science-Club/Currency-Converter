package currencyconverter.service;

import currencyconverter.model.Currency;
import java.util.HashMap;
import java.util.Map;

public class ExchangeRateManager {
    
    // The map storing our rates. Key is "FROM-TO" (e.g., "USD-EUR"), Value is the rate.
    private final Map<String, Double> rates = new HashMap<>();

    /**
     * TODO for AP CSA Student:
     * 1. Check if the rate is less than or equal to 0. If it is, do not add it to the map.
     * 2. Create a string key by combining 'from' and 'to' (e.g., "USD-EUR").
     * 3. Put the key and the rate into the 'rates' HashMap.
     */
    public void setRate(Currency from, Currency to, double rate) {
        // Implement logic here
    }

    /**
     * TODO for AP CSA Student:
     * 1. If 'from' and 'to' are the exact same currency, return 1.0.
     * 2. Create the string key to look up in the HashMap.
     * 3. If the map contains the key, return the rate.
     * 4. If the map does NOT contain the key, return -1.0.
     */
    public double getRate(Currency from, Currency to) {
        // Implement logic here
        return -1.0; 
    }
}