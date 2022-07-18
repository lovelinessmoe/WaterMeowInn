package vip.ashes.water_meow.bean;

import java.math.BigDecimal;

public class RuZhuBean {
    private String orderId;
    /**
     * 阿里订单id
     */
    private String ali_id;
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

    private BigDecimal price;
}
