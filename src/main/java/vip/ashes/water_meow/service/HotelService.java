package vip.ashes.water_meow.service;

import vip.ashes.water_meow.bean.Hotel;
import vip.ashes.water_meow.dao.HotelDao;

import java.util.ArrayList;

/**
 * @author loveliness
 */
public class HotelService {
    HotelDao hotelDao = new HotelDao();

    public ArrayList<Hotel> getHotelList() {
        return hotelDao.getHotelList();
    }

    public Hotel getHotelByNum(String roomNum) {
        return hotelDao.getHotelByNum(roomNum);
    }

    public void updateHotleState(String state, String roomNum) {
        hotelDao.updateHotleState(state, roomNum);
    }
}
