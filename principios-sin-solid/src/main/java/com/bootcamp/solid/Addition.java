package com.bootcamp.solid;

import interfaces.CuentasI;

public class Addition implements CuentasI {
    public double a;
    public double b;
    public double result = 0.0;

    public Addition(double a , double b) {
        this.a = a;
        this.b = b;
    }

	@Override
	public void hacerCuentas() {
		result = a+b;
		
	}
}