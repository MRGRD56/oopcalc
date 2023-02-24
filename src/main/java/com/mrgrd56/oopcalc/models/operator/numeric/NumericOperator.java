package com.mrgrd56.oopcalc.models.operator.numeric;

import com.mrgrd56.oopcalc.models.operator.Operator;

public interface NumericOperator extends Operator<Double, Double> {
    @Override
    Double proceed(Double[] operands);
}
