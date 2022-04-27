package com.bootcamp.solid;

import interfaces.CuentasI;

public class Operacion implements CuentasI{
    public double a;
    public double b;
    public double result = 0.0;
    public String s = null;

    public Operacion(double a , double b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }

	@Override
	public void hacerCuentas() {
		result = a%b;
		
	}
}
