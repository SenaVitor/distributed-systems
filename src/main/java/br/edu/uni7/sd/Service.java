package br.edu.uni7.sd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
	@GetMapping(path = "celsius2fahrenheit")
	public Double celciusToFahrenheit(Double value) {
		Double fahrenheit = value * 1.8 + 32;
		return fahrenheit;
	}
	
	@GetMapping(path = "fahrenheit2celsius")
	public Double fahrenheitToCelcius(Double value) {
		Double celcius = (value - 32)/1.8;
		return celcius;
	}
	
	@GetMapping(path = "factorial")
	public Double getFactorial(Double value) {
		Double factorial = 1D;
		for(Double i = value; i > 1; i--) {
			factorial *= i;
		}
		return factorial;
	}
	
	@GetMapping(path = "isprime")
	public boolean isPrime(int value) {
		for (int i = 2; i <= value/2; i++) {
            if (value % i == 0)
                return false;   
        }
		if(value == 1) return false;
        return true;
	}
}
