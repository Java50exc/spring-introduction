package telran.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
	@GetMapping("add")
	double add(double op1, double op2) {
		return op1 + op2;
	}
	
	@GetMapping("subtract")
	double subtract(double op1, double op2) {
		return op1 - op2;
	}
	
	@GetMapping("multiply")
	double multiply(double op1, double op2) {
		return op1 * op2;
	}
	
	@GetMapping("division")
	double division(double op1, double op2) {
		return op1 / op2;
	}
}
