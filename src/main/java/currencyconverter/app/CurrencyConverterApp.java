package currencyconverter.app;

import currencyconverter.model.Currency;
import currencyconverter.service.CurrencyConverterService;
import currencyconverter.service.StaticExchangeRateProvider;

import java.util.OptionalDouble;

/**
 * Starter entry point for manual experimentation.
 *
 * Tip: Keep this layer thin. It should orchestrate input/output and delegate
 * all business logic to CurrencyConverterService.
 */
public final class CurrencyConverterApp {

    private CurrencyConverterApp() {
        // Utility class
    }

    public static void main(String[] args) {
        StaticExchangeRateProvider rates = new StaticExchangeRateProvider();
        rates.setRate(Currency.USD, Currency.EUR, 0.92);

        CurrencyConverterService converter = new CurrencyConverterService(rates);
        OptionalDouble converted = converter.convert(100.0, Currency.USD, Currency.EUR);

        if (converted.isPresent()) {
            System.out.println("100 USD = " + converted.getAsDouble() + " EUR");
        } else {
            System.out.println("No conversion rate available.");
        }

        // Tip: Next steps for contributors:
        // 1) Parse user input instead of hardcoded values.
        // 2) Add validation and user-friendly error messages.
        // 3) Swap StaticExchangeRateProvider with an API-backed provider.
    }
}
