package za.co.sb.qpay.barista.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Coffee {

    private Long id;
    private String coffeeName;
    private String coffeeDescription;

}
