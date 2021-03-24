package edu.escuelaing.arep.app.operation;

public class Calculator {
    public double number;
    public String operation;

    public Calculator(double number, String operation){
        this.number = number;
        this.operation = operation;
    }

    public double getResultOperation(){
        double res = 0;
        if(operation.equals("sin")){
            res = Math.sin(number);
        }else if (operation.equals("ln")){
            res = Math.log(number);
        }
        return res;
    }

}
