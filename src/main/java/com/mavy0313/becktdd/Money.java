package com.mavy0313.becktdd;

class Money implements Expression {
  protected int amount;
  protected String currency;

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  @Override
  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount
        && currency().equals(money.currency());
  }

  Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  String currency() {
    return currency;
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }

  Expression plus(Money addend) {
    return new Sum(this, addend);
  }

  public Money reduce(String to) {
    return this;
  }
}
