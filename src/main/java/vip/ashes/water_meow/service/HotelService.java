package vip.ashes.water_meow.service;

import vip.ashes.water_meow.bean.Hotel;
import vip.ashes.water_meow.dao.HotelDao;
import vip.ashes.water_meow.dao.UserDao;

import java.util.ArrayList;

/**
 * @author loveliness
 */
public class HotelService {
    HotelDao hotelDao = new HotelDao();

    public ArrayList<Hotel> getHotelList(){
        return hotelDao.getHotelList();
    }
}
