package com.example.FirstWebAPI;

public class LastWeek_CrytoPricesOutputBuilder {

    public LastWeek_Market_data market_data;

    public LastWeek_CrytoPricesOutputBuilder market_data(LastWeek_Market_data market_data) {
        this.market_data=market_data;
        return this;
    }
    public LastWeek_CrytoPricesOutput build(){
        return new LastWeek_CrytoPricesOutput(this);
    }
}
