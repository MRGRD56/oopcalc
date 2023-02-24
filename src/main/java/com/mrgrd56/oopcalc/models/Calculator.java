package com.mrgrd56.oopcalc.models;

import com.mrgrd56.oopcalc.models.operation.Operation;
import com.mrgrd56.oopcalc.models.operator.Operator;

public class Calculator {
    public <O, R, OP extends Operator<O, R>> R calculate(Operation<O, R, OP> operation) {
        return operation.getOperator().proceed(operation.getOperands());
    }
}
