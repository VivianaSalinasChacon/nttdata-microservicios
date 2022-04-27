package com.bootcamp.solid;
public class Calculator {
    public void calculate(Object operation) throws Exception {
        if (operation == null) {
            throw new Exception("Can not perform operation");
        }

//        if(operation instanceof  Addition){
//             Addition ad = (Addition) operation;
//             ad.result = ad.a + ad.b;
//        } else if (operation instanceof Substraction){
//            Substraction sb = (Substraction) operation;
//            sb.result = sb.a - sb.b;
//        } else if (operation instanceof Multiplication){
//            Multiplication ml = (Multiplication) operation;
//            ml.result = ml.a * ml.b;
//        } else if (operation instanceof Dividir){
//            Dividir dv = (Dividir) operation;
//            dv.result = dv.a / dv.b;
//        } else if (operation instanceof Operacion) {
//        	Operacion op = (Operacion) operation;
//        	String variable = "%";
//			op.result = op.a % op.b;
//        }
    }

    public static void main(String[] args) throws Exception {

        //Calculator  obj = new Calculator();

        Addition add = new Addition(10,5);
        //obj.calculate(add);
        add.hacerCuentas();

        System.out.println("Resultado calculator: " +  add.result);

        Substraction sb = new Substraction(10,5);
        //obj.calculate(sb);
        sb.hacerCuentas();

        System.out.println("Resultado susbration " +  sb.result);

        Multiplication ml = new Multiplication(10,5);
        //obj.calculate(ml);
        ml.hacerCuentas();

        System.out.println("Resultado multiplication " +  ml.result);

        Dividir dv = new Dividir(10,5);
        //obj.calculate(dv);
        dv.hacerCuentas();

        System.out.println("Resultado division " +  dv.result);
        
        Operacion operacion = new Operacion(2,2,"%");
        //obj.calculate(operacion);
        operacion.hacerCuentas();
        
        System.out.println("Resultado operacion " +  operacion.result);
    }

}