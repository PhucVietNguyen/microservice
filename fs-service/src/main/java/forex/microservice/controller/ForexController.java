package forex.microservice.controller;

import forex.microservice.dto.ExchangeValueDto;
import forex.microservice.service.ExchangeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class ForexController {

    @Autowired
    private ExchangeValueService exchangeValueService;

    @GetMapping(value = "/convert/{from}/{to}")
    public ExchangeValueDto findValueConvertCurrency(@PathVariable String from, @PathVariable String to){
        return exchangeValueService.findByFromAnTo(from, to);
    }

}
