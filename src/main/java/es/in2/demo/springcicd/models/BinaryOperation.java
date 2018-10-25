package es.in2.demo.springcicd.models;

public class BinaryOperation {
    private BinaryOperands operands;
    private Float result;

    public BinaryOperation(BinaryOperands operands) {
        this.operands = operands;
    }

    public Float getResult() {
        return result;
    }

    public BinaryOperands getOperands() {
        return operands;
    }

    public Float divide() {
        return this.result;
    }
}
