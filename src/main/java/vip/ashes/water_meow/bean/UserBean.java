package vip.ashes.water_meow.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author loveliness
 * user用户表用于存放用户信息
 * (user_account,passwd,user_name,sex,birth,mob,user_type)
 * 字段分别是 账号，密码，用户名，性别，生日，手机号，用户类型）
 */
@Data
@NoArgsConstructor
public class UserBean {
    private String account, password, name, sex, birth, mob, type;
    private int id;
}
