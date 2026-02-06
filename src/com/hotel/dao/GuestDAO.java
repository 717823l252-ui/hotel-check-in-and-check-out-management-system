package com.hotel.dao;

import com.hotel.bean.Guest;
import java.util.ArrayList;
import java.util.List;

public class GuestDAO {

    private static List<Guest> guestList = new ArrayList<>();

    public boolean insertGuest(Guest guest) {
        guestList.add(guest);
        return true;
    }

    public Guest findGuest(String guestID) {
        for (Guest g : guestList) {
            if (g.getGuestID().equals(guestID)) {
                return g;
            }
        }
        return null;
    }

    public List<Guest> viewAllGuests() {
        return guestList;
    }

    public boolean deleteGuest(String guestID) {
        return guestList.removeIf(g -> g.getGuestID().equals(guestID));
    }
}
