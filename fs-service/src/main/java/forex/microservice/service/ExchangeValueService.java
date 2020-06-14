package forex.microservice.service;

import forex.microservice.dto.ExchangeValueDto;

public interface ExchangeValueService {
    ExchangeValueDto findByFromAnTo(String currencyFrom, String currencyTo);
}
