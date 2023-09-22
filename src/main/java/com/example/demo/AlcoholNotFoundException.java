package com.example.demo;

public class AlcoholNotFoundException extends RuntimeException {

        private final int price;

        public AlcoholNotFoundException(int price) {
            this.price = price;
        }

        @Override
        public String getMessage() {
            return "Alcohol with price = " + price + " not found";
        }
}
