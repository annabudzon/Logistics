package calculations;

public class TaskSolver {

    //zadanie do rozwiązania z danymi
    private Task task;

    private Result result;

    public TaskSolver(double length, double kits_amount, int elements1_amount, int elements2_amount, double price_m){
        if(task == null) {
            task = new Task(length, kits_amount, elements1_amount, elements2_amount, price_m);
        }
    }

    public TaskSolver(double length, double kits_amount, int elements1_amount, int elements2_amount){
        if(task == null) {
            task = new Task(length, kits_amount, elements1_amount, elements2_amount);
        }
    }

    public TaskSolver(){}

    //warunek dla elementu typu 1 - zapisanie do Result
    public void calculateCondition1(){}

    //warunek dla elementu typu 2 - zapisanie do Result
    public void calculateCondition2(){}

    //wyliczenie ilości możliwych rozkrojów produktu, dodanie do listy w Task, w Result też (do wyświetlenia)
    public void calculateCutMethods(){}

    //wyliczenie funkcji celu i zapisanie do Result
    public void calculateGoalFuntion(){}

    public void calculateMinimumOfGoalFuntion(){}
}
