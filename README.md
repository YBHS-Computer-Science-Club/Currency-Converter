# Currency-Converter
A currency converter made in Java.

## Starter project outline
This repository now includes starter classes designed for club collaboration and future expansion:

- `/home/runner/work/Currency-Converter/Currency-Converter/src/main/java/club/ybhs/currencyconverter/model/Currency.java`
  - Currency enum (starter list, easy to expand).
- `/home/runner/work/Currency-Converter/Currency-Converter/src/main/java/club/ybhs/currencyconverter/service/ExchangeRateProvider.java`
  - Interface for rate retrieval (supports future API integrations).
- `/home/runner/work/Currency-Converter/Currency-Converter/src/main/java/club/ybhs/currencyconverter/service/StaticExchangeRateProvider.java`
  - In-memory starter implementation for rates.
- `/home/runner/work/Currency-Converter/Currency-Converter/src/main/java/club/ybhs/currencyconverter/service/CurrencyConverterService.java`
  - Core conversion logic (kept separate from UI/input).
- `/home/runner/work/Currency-Converter/Currency-Converter/src/main/java/club/ybhs/currencyconverter/app/CurrencyConverterApp.java`
  - Basic entry point demo to help contributors run and iterate.

Each class includes implementation tips as comments so students can continue building features such as a UI or live exchange-rate API support.
