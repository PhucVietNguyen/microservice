package forex.microservice.dto;


import forex.microservice.model.ExchangeValueEntity;

import java.math.BigDecimal;

public class ExchangeValueDto {

    private Long id;

    private String currencyFrom;

    private String currencyTo;

    private BigDecimal conversionMultiple;

    public ExchangeValueDto() {
    }

    public ExchangeValueDto(Long id, String currencyFrom, String currencyTo, BigDecimal conversionMultiple) {
        this.id = id;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.conversionMultiple = conversionMultiple;
    }
    public ExchangeValueDto(ExchangeValueEntity entity) {
        this.id = entity.getId();
        this.currencyFrom = entity.getCurrencyFrom();
        this.currencyTo = entity.getCurrencyTo();
        this.conversionMultiple = entity.getConversionMultiple();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
}
