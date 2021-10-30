package com.best.controller;

import com.best.model.BestHotel;
import com.best.dto.SearchResult;
import com.best.dto.SearchRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BestHotelsController {

    @PostMapping("BestHotels")
    @ResponseBody
    public SearchResult findHotels(@RequestBody SearchRequest searchQuery) {

        /* Create and return Dummy Results */
        List<BestHotel> hotels = new ArrayList<>();
        hotels.add(createDummyHotel(80.4, "Movenpick", "Swim Pool, Kitchen, TV"));
        hotels.add(createDummyHotel(94.3, "Ramada", "Hair dryer, Extra Bed, TV, Private bool"));
        hotels.add(createDummyHotel(60.8, "Four Season", "Balcony, Extra Bed, TV, Drinks"));

        SearchResult result = new SearchResult();
        result.addHotels(hotels);

        return result;
    }

    /**
     *  Create Dummy BestHotel Objects
     * @param price
     * @param name
     * @param roomAmenities
     * @return
     */
    private BestHotel createDummyHotel(double price, String name, String roomAmenities) {
        BestHotel hotel = new BestHotel();
        hotel.setPrice(price);
        hotel.setHotelName(name);
        hotel.setRate( 3);
        hotel.setRoomAmenities(roomAmenities);
        return hotel;
    }


}
