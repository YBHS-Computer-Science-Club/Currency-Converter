package currencyconverter.service;

import currencyconverter.model.Currency;
import java.util.OptionalDouble;

/**
 * Abstraction for fetching exchange rates.
 *
 * Tip: Keep this interface as the single source for rate lookups so you can
 * later swap implementations (hardcoded map, file, database, web API, etc.).
 */
public interface ExchangeRateProvider {

    /**
     * Gets the conversion rate from one currency to another.
     *
     * Tip: Return OptionalDouble.empty() when no reliable rate is available.
     */
    OptionalDouble getRate(Currency from, Currency to);
}
