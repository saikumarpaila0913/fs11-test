package com.geekster.Restaurant.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Restaurant {
    @Getter @Setter
    Integer RestaurantId;
    String RestaurantName;
    String RestaurantAddress;
    Integer PhoneNo;
    String Special;

    public Integer getRestaurantId() {
        return RestaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        RestaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return RestaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        RestaurantAddress = restaurantAddress;
    }

    public Integer getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getSpecial() {
        return Special;
    }

    public void setSpecial(String special) {
        Special = special;
    }


}