package es.in2.demo.springcicd.models;

public class BinaryOperands {
    private Float operand1;
    private Float operand2;

    public BinaryOperands(Float operand1, Float operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public Float getOperand1() {
        return operand1;
    }

    public void setOperand1(Float operand1) {
        this.operand1 = operand1;
    }

    public Float getOperand2() {
        return operand2;
    }

    public void setOperand2(Float operand2) {
        this.operand2 = operand2;
    }
}
