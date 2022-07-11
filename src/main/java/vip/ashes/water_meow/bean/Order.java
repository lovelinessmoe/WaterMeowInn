package vip.ashes.water_meow.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
    private Integer orderId;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 房间门牌号
    */
    private String roomNum;

    /**
    * 0未支付1已支付
    */
    private String state;
}