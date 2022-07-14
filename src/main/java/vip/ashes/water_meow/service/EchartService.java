package vip.ashes.water_meow.service;

import cn.hutool.json.JSONObject;
import vip.ashes.water_meow.dao.echartDao;

public class EchartService {
    public static JSONObject queryUserTypeList() {
        return echartDao.getUserTypeList();
    }
}
