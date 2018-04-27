package calculations;

import java.util.ArrayList;
import java.util.List;

public class Result {

    //tak dużo jak obiektów CutMethod
    private ArrayList<Double> x;

    //końcowa wartość funkcji celu
    private double goal_function_value;

    //funkcja celu: goal_function[0]*x1+goal_function[1]*x2+...
    private ArrayList<Double> goal_function;

    //warunek dla elementów rodzaju 1, wchodzacych w skład kompletu
    private ArrayList<Double> condition1_function;

    //warunek dla elementów rodzaju 1, wchodzacych w skład kompletu
    private ArrayList<Double> condition2_function;

    //wartość ograniczająca warunek 1
    private int condition1;

    //wartość ograniczająca warunek 2
    private int condition2;

    public Result(ArrayList<Double> x, double goal_function_value, ArrayList<Double> goal_function, ArrayList<Double> condition1_function, int condition1, int condition2) {
        this.x = x;
        this.goal_function_value = goal_function_value;
        this.goal_function = goal_function;
        this.condition1_function = condition1_function;
        this.condition1 = condition1;
        this.condition2 = condition2;
    }
}
