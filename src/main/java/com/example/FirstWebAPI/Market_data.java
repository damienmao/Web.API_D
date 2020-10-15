package com.example.FirstWebAPI;

public class Market_data {
    private Price_change_24h_in_currency price_change_24h_in_currency;
    private Current_price current_price;

    public Price_change_24h_in_currency getPrice_change_24h_in_currency() {
        return price_change_24h_in_currency;
    }

    public void setPrice_change_24h_in_currency(Price_change_24h_in_currency price_change_24h_in_currency) {
        this.price_change_24h_in_currency = price_change_24h_in_currency;
    }

    public Current_price getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(Current_price current_price) {
        this.current_price = current_price;
    }
}
