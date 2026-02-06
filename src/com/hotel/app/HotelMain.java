package com.hotel.app;

import java.util.Date;
import java.util.Scanner;

import com.hotel.service.StayService;

public class HotelMain { 
private static StayService stayService; 
public static void main(String[] args) { 
stayService = new StayService(); 
Scanner sc = new Scanner(System.in); 
System.out.println("--- Hotel Check-In/Check-Out Console ---"); 
// TEST 1: Attempt check-in when room unavailable 
try { 
boolean r = 
stayService.checkInGuest("G1003","R101",new Date(),2500.00); 
System.out.println(r ? "CHECKED-IN" : "FAILED"); 
} catch(Exception e) { System.out.println(e); } 
// TEST 2: Successful check-in 
try { 
boolean r = 
stayService.checkInGuest("G1001","R102",new Date(),1800.00); 
System.out.println(r ? "CHECKED-IN" : "FAILED"); 
} catch(Exception e) { System.out.println(e); } 
// TEST 3: Check-out and bill generation 
try { 
boolean r = stayService.checkOutGuest(60001); 
System.out.println(r ? "CHECKED-OUT" : "FAILED"); 
} catch(Exception e) { System.out.println(e); } 
sc.close(); 
} 
}