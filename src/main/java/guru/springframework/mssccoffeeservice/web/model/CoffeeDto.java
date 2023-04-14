package guru.springframework.mssccoffeeservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CoffeeDto {

    private UUID id;
    private Integer version;
    private OffsetDateTime createdDate; //UTC date format
    private OffsetDateTime lastModifiedDate;
    private String coffeeName;
    private CoffeeStyleEnum coffeeStyle;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;


}
