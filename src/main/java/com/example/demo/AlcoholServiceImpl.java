package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class AlcoholServiceImpl implements AlcoholService {
    @Override
    public Alcohol getAlcohol(int price) {
        // имитируем обращение к БД
        if (price == 5000) {
            return new Alcohol(
                    price,
                    "Cognac",
                    "Hennesy"
            );
        } else if (price == 1000) {
            return new Alcohol(
                    price,
                    "Gin",
                    "Beefeater"
            );
        } else {
            throw new AlcoholNotFoundException(price);
        }
    }
}
