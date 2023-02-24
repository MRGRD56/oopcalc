package com.mrgrd56.oopcalc.models.operator.numeric;

import com.mrgrd56.oopcalc.models.operator.DoubleOperandOperator;

public class DivideOperator implements NumericOperator, DoubleOperandOperator {
    @Override
    public Double proceed(Double[] operands) {
        return operands[0] / operands[1];
    }
}
