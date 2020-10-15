package com.example.FirstWebAPI;

import java.util.ArrayList;
import java.util.List;

public class SecondCryptoCurrencyOutputBuilder {
    public String id;
    public float current_price;
    public long market_cap;

    public SecondCryptoCurrencyOutputBuilder Id(String id) {
        this.id = id;
        return this;
    }

    public SecondCryptoCurrencyOutputBuilder Current_price(float current_price) {
        this.current_price = current_price;
        return this;
    }

    public SecondCryptoCurrencyOutputBuilder Market_cap(long market_cap) {
        this.market_cap = market_cap;
        return this;
    }

    public SecondCryptoCurrencyOutput build(){
        return new SecondCryptoCurrencyOutput(this);
    }
}
