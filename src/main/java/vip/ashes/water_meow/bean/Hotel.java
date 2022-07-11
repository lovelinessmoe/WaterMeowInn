package vip.ashes.water_meow.bean;

import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Hotel {
    /**
    * 门牌号
    */
    private String roomNum;

    private BigDecimal price;

    /**
    * 0单人1双人大床2标间
    */
    private String type;

    /**
    * 0未使用1已预订2已入住
    */
    private String state;
}