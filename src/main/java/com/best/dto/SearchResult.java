package com.best.dto;

import com.best.model.BestHotel;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {
    private static final long serialVersionUID = 2L;

    private List<BestHotel> hotels = new ArrayList<>();

    public List<BestHotel> getHotels() {
        return hotels;
    }

    public void addHotels(List<BestHotel> hotels) {
        this.hotels.addAll(hotels);
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "hotels=" + hotels +
                '}';
    }
}
