package com.mavy0313.becktdd;

interface Expression {

  Money reduce(Bank bank, String to);

  Expression plus(Expression addend);
}
