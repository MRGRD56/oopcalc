package com.mrgrd56.oopcalc.models.operator.common;

import com.mrgrd56.oopcalc.models.operator.DoubleOperandOperator;
import com.mrgrd56.oopcalc.models.operator.Operator;

import java.util.Objects;

public class EqualsOperator implements Operator<Object, Boolean>, DoubleOperandOperator {
    @Override
    public Boolean proceed(Object[] operands) {
        return Objects.equals(operands[0], operands[1]);
    }
}
