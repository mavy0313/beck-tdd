package com.mavy0313.becktdd;

class Money {
  protected int amount;

  @Override
  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount;
  }
}
