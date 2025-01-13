package org.example;

import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        System.out.println(integerate((double x)->x+10,3,7));

        Function<Function<Double,Double>,Function<Double,Double>> f;

        DoubleUnaryOperator covertUSDtoGBP = curriedConverter(0.6,10);
        System.out.println(covertUSDtoGBP.applyAsDouble(1000));
    }

    static DoubleUnaryOperator curriedConverter(double f,double b){
        return (double x)->x*f+b;
    }
    public static double integerate(DoubleFunction<Double> f, double a, double b){
        System.out.println(f.apply(a));
        return (f.apply(a) + f.apply(b))*(b-a)/2.0;
    }

}