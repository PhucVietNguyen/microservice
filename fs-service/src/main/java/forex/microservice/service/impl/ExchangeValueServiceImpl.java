package forex.microservice.service.impl;

import forex.microservice.dto.ExchangeValueDto;
import forex.microservice.model.ExchangeValueEntity;
import forex.microservice.repository.ExchangeValueRepository;
import forex.microservice.service.ExchangeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ExchangeValueServiceImpl implements ExchangeValueService {

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;

    @Override
    public ExchangeValueDto findByFromAnTo(String currencyFrom, String currencyTo) {
        List<ExchangeValueEntity> entitys = exchangeValueRepository.findAllByCurrencyFromAndCurrencyTo(currencyFrom, currencyTo);
        ExchangeValueDto dto = null;
        if(entitys != null && !entitys.isEmpty()){
            dto = new ExchangeValueDto(entitys.get(0));
        }
        return dto;
    }
}
