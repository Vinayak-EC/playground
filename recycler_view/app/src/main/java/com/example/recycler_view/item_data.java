package com.example.recycler_view;

public class item_data {

    private String profile_name;
    private String description;
/**   constructor ****/
    public item_data(String profile_name, String description) {
        this.profile_name = profile_name;
        this.description = description;
    }

    /**** getters ****/
    public String getProfile_name() {
        return profile_name;
    }

    public String getDescription() {
        return description;
    }
}
