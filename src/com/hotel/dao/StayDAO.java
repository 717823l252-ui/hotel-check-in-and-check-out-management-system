package com.hotel.dao;

import com.hotel.bean.Stay;
import java.util.ArrayList;
import java.util.List;

public class StayDAO {

    private static List<Stay> stayList = new ArrayList<>();
    private static int stayCounter = 60000;

    public int generateStayID() {
        return ++stayCounter;
    }

    public boolean recordCheckIn(Stay stay) {
        stayList.add(stay);
        return true;
    }

    public boolean closeStay(int stayID) {
        for (Stay s : stayList) {
            if (s.getStayID() == stayID) {
                s.setStatus("CLOSED");
                return true;
            }
        }
        return false;
    }
}
