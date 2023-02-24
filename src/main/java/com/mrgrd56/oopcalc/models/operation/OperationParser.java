package com.mrgrd56.oopcalc.models.operation;

import com.mrgrd56.oopcalc.models.operator.Operator;
import com.mrgrd56.oopcalc.models.operator.common.EqualsOperator;
import com.mrgrd56.oopcalc.models.operator.numeric.*;

public class OperationParser {
    public Operation<?, ?, ?> parse(String input) {
        String[] parts = input.split("\\s");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid expression");
        }

        Operator<?, ?> operator = parseOperator(parts[1]);
        if (operator instanceof NumericOperator numericOperator) {
            Double[] operands = new Double[] {Double.parseDouble(parts[0]), Double.parseDouble(parts[2])};
            return new Operation<>(numericOperator, operands);
        }

        return new Operation<>((Operator<? super Object, ?>) operator, new Object[] {parts[0], parts[2]});
    }

    private Operator<?, ?> parseOperator(String operatorInput) {
        return switch (operatorInput) {
            case "+" -> new SumOperator();
            case "-" -> new SubtractOperator();
            case "*" -> new MultiplyOperator();
            case "/" -> new DivideOperator();
            case "==" -> new EqualsOperator();
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}
