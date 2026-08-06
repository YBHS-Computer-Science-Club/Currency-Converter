package currencyconverter.service;

import currencyconverter.model.Currency;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;

/**
 * In-memory starter implementation of exchange rates.
 *
 * Tip: This is intentionally simple for students. Later, replace or wrap this
 * with an API-backed implementation that refreshes rates automatically.
 */
public class StaticExchangeRateProvider implements ExchangeRateProvider {
    private final Map<String, Double> rates = new HashMap<>();

    /**
     * Stores a conversion rate from one currency to another.
     *
     * Tip: Keep this method in one place so validation (positive rate checks,
     * duplicate handling, logging) can be added without touching callers.
     */
    public void setRate(Currency from, Currency to, double rate) {
        if (rate <= 0) {
            throw new IllegalArgumentException("Rate must be positive.");
        }
        rates.put(key(from, to), rate);
    }

    @Override
    public OptionalDouble getRate(Currency from, Currency to) {
        if (from == to) {
            return OptionalDouble.of(1.0);
        }

        Double directRate = rates.get(key(from, to));
        if (directRate != null) {
            return OptionalDouble.of(directRate);
        }

        // Tip: Later enhancement idea: infer cross-rates via a base currency.
        return OptionalDouble.empty();
    }

    private String key(Currency from, Currency to) {
        return from + "->" + to;
    }
}
