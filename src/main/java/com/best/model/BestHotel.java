package com.best.model;

public class BestHotel {
    private static final long serialVersionUID = 2L;
    /* Hotel Name */
    private String hotelName;
    /* Hotel Rate*/
    private int rate;
    /* Hotel Price */
    private double price;
    /*String of amenities separated by comma */
    private String roomAmenities;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRoomAmenities() {
        return roomAmenities;
    }

    public void setRoomAmenities(String roomAmenities) {
        this.roomAmenities = roomAmenities;
    }

    @Override
    public String toString() {
        return "BestHotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rate=" + rate +
                ", price=" + price +
                ", roomAmenities='" + roomAmenities + '\'' +
                '}';
    }
}
