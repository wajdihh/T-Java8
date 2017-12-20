package com.hh.training;

import com.hh.training.extensionMethods.Formula;
import com.hh.training.functionalInterfaces.Converter;
import com.hh.training.lambda.LambdaExample;

/**
 * This is a test project of all java 8 features according this URL
 * http://winterbe.com/posts/2014/03/16/java-8-tutorial/
 */
public class Main {

    public static void main(String[] args) {

        new Main().functionalInterfaces();

    }


    /**
     * Extension Methods
     */
    private void extensionMethods(){

        Formula formula= new Formula() {
            @Override
            public double calculate(int a) {
                return a* 10;
            }
        };
        System.out.println("calculate : "+formula.calculate(5));
        System.out.println("sqrt : "+formula.sqrt(5));
        System.out.println("calculate : "+formula.sum(5,10));
    }

    /**
     * Lambda expression
     */
    private void lambdaExpression(){
        new LambdaExample().step4();
    }

    /**
     * functional Interfaces
     */
    private void functionalInterfaces(){
         /*
          * override and apply code inside the abstract method in one single line inside an other method
          */
          // we can write like this  : Converter converter = (a) -> { return  Integer.parseInt(a)*10; };
          // OR we can write like this  : Converter converter = (a) ->  Integer.parseInt(a)*10;
        Converter converter = a ->  Integer.parseInt(a)*10;
        int convFormated=converter.convert("233");
        System.out.println("Converted is "+convFormated);
    }
}
