package com.mavy0313.becktdd;

class Franc extends Money {

  Franc(int amount, String currency) {
    super(amount, currency);
  }

  Money times(int multiplier) {
    return Money.franc(amount * multiplier);
  }

  @Override
  String currency() {
    return currency;
  }
}
