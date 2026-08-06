package currencyconverter.service;

import currencyconverter.model.Currency;
import java.util.OptionalDouble;

/**
 * Core conversion logic isolated from input/output concerns.
 *
 * Tip: Keeping this class framework-agnostic makes it reusable for a CLI,
 * desktop UI, web app, or test harness.
 */
public class CurrencyConverterService {
    private final ExchangeRateProvider rateProvider;

    public CurrencyConverterService(ExchangeRateProvider rateProvider) {
        this.rateProvider = rateProvider;
    }

    /**
     * Converts amount from source currency to target currency.
     *
     * Tip: Add rounding policy decisions in one place here (for example,
     * BigDecimal + banker's rounding) once your club defines requirements.
     */
    public OptionalDouble convert(double amount, Currency from, Currency to) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }

        OptionalDouble rate = rateProvider.getRate(from, to);
        if (rate.isEmpty()) {
            return OptionalDouble.empty();
        }

        return OptionalDouble.of(amount * rate.getAsDouble());
    }
}
