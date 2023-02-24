package com.mrgrd56.oopcalc;

import com.mrgrd56.oopcalc.models.Calculator;
import com.mrgrd56.oopcalc.models.operation.Operation;
import com.mrgrd56.oopcalc.models.operation.OperationParser;

public class Program {
    public static void main(String[] args) {
        var calculator = new Calculator();
        var operationParser = new OperationParser();

        Operation<?, ?, ?> operation = operationParser.parse("0.1 + 0.2");
        Object result = calculator.calculate(operation);
        Operation<?, ?, ?> operation2 = operationParser.parse("0.30000000000000004 == " + result);
        Object result2 = calculator.calculate(operation2);
    }
}
