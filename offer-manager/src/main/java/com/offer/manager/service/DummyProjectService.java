package com.offer.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DummyProjectService {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<String> getOffers() {
        return restTemplate.getForEntity("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=IBM&interval=5min&apikey=US92CDZJAO0U6AER", String.class);
    }
}
