package com.example.FirstWebAPI;

public class LastWeek_CrytoPricesOutput {

    private LastWeek_Market_data market_data;

    public LastWeek_Market_data getMarket_data() {
        return market_data;
    }
    public void setMarket_data(LastWeek_Market_data market_data) {
        this.market_data = market_data;
    }

    public LastWeek_CrytoPricesOutput(LastWeek_CrytoPricesOutputBuilder lastWeek_crytoPricesOutputBuilder){

        market_data=lastWeek_crytoPricesOutputBuilder.market_data;

    }

    public LastWeek_CrytoPricesOutput() {
    }
}
