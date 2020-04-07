package com.mavy0313.becktdd;

abstract class Money {
  protected int amount;
  protected String currency;

  static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  @Override
  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount
        && getClass().equals(money.getClass());
  }

  abstract Money times(int multiplier);

  String currency() {
    return currency;
  }
}