package es.in2.demo.springcicd.controllers;

import es.in2.demo.springcicd.models.BinaryOperands;
import es.in2.demo.springcicd.models.BinaryOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BinaryOperationController {
    @PostMapping("/divide")
    @ResponseBody
    public BinaryOperation divide(@RequestBody BinaryOperands operands ) {
        BinaryOperation bop = new BinaryOperation(operands);
        bop.divide();
        return bop;
    }
}
