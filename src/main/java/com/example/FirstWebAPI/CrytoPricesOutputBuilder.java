package com.example.FirstWebAPI;

public class CrytoPricesOutputBuilder {
    public String id;
    public String name;
    public String symbol;
    public String last_updated;
    public String genesis_date;
    public Market_data market_data;


    public CrytoPricesOutputBuilder market_data(Market_data market_data) {
        this.market_data=market_data;
        return this;
    }
    public CrytoPricesOutputBuilder genesis_date(String genesis_date) {
        this.genesis_date=genesis_date;
        return this;
    }

    public CrytoPricesOutputBuilder getId(String id) {
        this.id=id;
        return this;
    }
    public CrytoPricesOutputBuilder getName(String name) {
        this.name=name;
        return this;
    }
    public CrytoPricesOutputBuilder getSymbol(String symbol) {
        this.symbol=symbol;
        return this;
    }

    public CrytoPricesOutputBuilder getLast_updated(String last_updated) {
        this.last_updated = last_updated;
        return this;
    }

    public CrytoPricesOutput build(){
        return new CrytoPricesOutput(this);
    }
}
