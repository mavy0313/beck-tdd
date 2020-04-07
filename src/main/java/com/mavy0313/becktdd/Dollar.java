package com.mavy0313.becktdd;

class Dollar extends Money {

  Dollar(int amount, String currency) {
    super(amount, currency);
  }

  Money times(int multiplier) {
    return Money.dollar(amount * multiplier);
  }

  @Override
  String currency() {
    return currency;
  }
}
