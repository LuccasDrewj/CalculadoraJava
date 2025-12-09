package model;

public class Calculadora {
	
	public double somar(double a, double b) {
		return a + b;
	}
	
	public double subtrair(double a, double b) {
		return a - b;
	}
	
	public double multiplicar(double a, double b) {
		return a * b;
	}
	
	public double dividir(double a, double b) throws IllegalAccessException {
		if (b == 0) {
			throw new IllegalAccessException("Divisao por Zero nao da certo!");
		} else {
			return a / b;
		}
	}
}
