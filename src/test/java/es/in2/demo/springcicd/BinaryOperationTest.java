package es.in2.demo.springcicd;

import es.in2.demo.springcicd.models.BinaryOperands;
import es.in2.demo.springcicd.models.BinaryOperation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BinaryOperationTest {
    @Test
    public void divisionFirstOperandGreatherThan() {
        BinaryOperation op = new BinaryOperation(new BinaryOperands(5.f, 2.f));
        op.divide();
        assertThat(op.getResult()).isEqualTo(2.5f);
    }

    @Test
    public void divisionSecondOperandGreatherThan() {
        BinaryOperation op = new BinaryOperation(new BinaryOperands(5.f, 10.f));
        op.divide();
        assertThat(op.getResult()).isEqualTo(0.5f);
    }

    @Test
    public void divisionEqualOperands() {
        BinaryOperation op = new BinaryOperation(new BinaryOperands(5.f, 5.f));
        op.divide();
        assertThat(op.getResult()).isEqualTo(1.f);
    }

    @Test
    public void divisionFirstOperandZero() {
        BinaryOperation op = new BinaryOperation(new BinaryOperands(0.f, 2.f));
        op.divide();
        assertThat(op.getResult()).isEqualTo(0.f);
    }

    @Test
    public void divisionSecondOperandZero() {
        BinaryOperation op = new BinaryOperation(new BinaryOperands(5.f, 0.f));
        op.divide();
        assertThat(true).isEqualTo(Float.isInfinite(op.getResult()));
    }

    @Test
    public void divisionResultStored() {
        BinaryOperation op = new BinaryOperation(new BinaryOperands(5.f, 2.f));
        assertThat(op.divide()).isEqualTo(op.getResult());
    }
}
