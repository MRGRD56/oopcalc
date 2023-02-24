package com.mrgrd56.oopcalc.models.operator;

public interface Operator<O, R> {
    R proceed(O[] operands);
}
