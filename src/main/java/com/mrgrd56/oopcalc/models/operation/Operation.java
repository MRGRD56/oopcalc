package com.mrgrd56.oopcalc.models.operation;

import com.mrgrd56.oopcalc.models.operator.Operator;

public class Operation<O, R, OP extends Operator<O, R>> {
    private final OP operator;
    private final O[] operands;

    public Operation(OP operator, O[] operands) {
        this.operator = operator;
        this.operands = operands;
    }

    public OP getOperator() {
        return operator;
    }

    public O[] getOperands() {
        return operands;
    }
}
