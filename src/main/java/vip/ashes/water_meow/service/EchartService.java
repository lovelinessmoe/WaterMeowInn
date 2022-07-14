package vip.ashes.water_meow.service;

import cn.hutool.json.JSONObject;
import vip.ashes.water_meow.dao.EchartDao;

public class EchartService {
    EchartDao echartDao = new EchartDao();

    public String queryUserTypeList() {
        return echartDao.getUserTypeList();
    }

    public int[] queryHotelStateList() {
        return echartDao.getHotelStateList();
    }
}
