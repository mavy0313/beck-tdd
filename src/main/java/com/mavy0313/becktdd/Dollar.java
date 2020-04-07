package com.mavy0313.becktdd;

class Dollar extends Money {

  Dollar(int amount, String currency) {
    super(amount, currency);
  }

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  @Override
  String currency() {
    return currency;
  }
}
