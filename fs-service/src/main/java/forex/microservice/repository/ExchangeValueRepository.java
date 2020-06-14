package forex.microservice.repository;

import forex.microservice.model.ExchangeValueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValueEntity, Long> {

    List<ExchangeValueEntity> findAllByCurrencyFromAndCurrencyTo(@Param("currencyFrom") String currencyFrom, @Param("currencyTo") String currencyTo);
}
