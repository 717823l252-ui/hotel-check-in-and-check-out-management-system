package com.hotel.service;

import com.hotel.bean.Stay;
import com.hotel.dao.StayDAO;
import java.util.Date;

public class StayService {

    StayDAO stayDAO = new StayDAO();

    public boolean checkInGuest(String guestID, String roomNumber, Date date, double rate) {
        Stay stay = new Stay();
        stay.setStayID(stayDAO.generateStayID());
        stay.setGuestID(guestID);
        stay.setRoomNumber(roomNumber);
        stay.setCheckInDate(date);
        stay.setRoomRate(rate);
        stay.setStatus("ACTIVE");

        return stayDAO.recordCheckIn(stay);
    }

    public boolean checkOutGuest(int stayID) {
        return stayDAO.closeStay(stayID);
    }
}
