package com.example.FirstWebAPI;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@Component
public class CoingeckoClient<secondCryptoCurrencyOutput> {

    @Autowired
    private RestTemplate restTemplate;

    Date Today=new Date();
    long DAY_IN_MS = 1000 * 60 * 60 * 24;
    SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");

    Date date_OneWeekAgo =new Date(System.currentTimeMillis()-7*DAY_IN_MS);
    String Str_date_OneWeekAge=formatter.format(date_OneWeekAgo);
    String Str_Today=formatter.format(Today);

    String URL="https://api.coingecko.com/api/v3/coins/";



    public ResponseEntity<?> getInfoCoingecko(String id){
        System.out.println(Str_Today);
        System.out.println("API Coingecko");

        return
                restTemplate.getForEntity(URL+id,CrytoPricesOutput.class,id);

        //.getForEntity method retrieves resources of a given URI or URL templates
    }
    public ResponseEntity<?> getLastWeekInfoCoingecko(String id){
        return
                restTemplate.getForEntity(URL+id+"/history?date="+Str_date_OneWeekAge,
                        LastWeek_CrytoPricesOutput.class);

    }

    public ResponseEntity<?> getMarketInfo(String currency,String id){
        return
                restTemplate.getForEntity(URL+"markets?vs_currency="+currency+"&ids="+id
                                +"&order=market_cap_desc&per_page=10&page=1&sparkline=false",
                        SecondCryptoCurrencyOutput[].class);
    }



}
