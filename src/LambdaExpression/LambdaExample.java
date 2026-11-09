package LambdaExpression;
@FunctionalInterface
interface Greet {
    void greeting();
}

@FunctionalInterface
interface Task {
    void doTask();
}

@FunctionalInterface
interface Calculate {
    int doCalculation(int number);
}

@FunctionalInterface
interface Calculator {
    int calculation(int a, int b);
}
public class LambdaExample {
    static void main() {

        Greet greet = () -> System.out.println("Hi friends, How are you?");
        greet.greeting();

        Task task = () -> {
            System.out.println("Task 1: Wake up");
            System.out.println("Task 2: Pray");
            System.out.println("Task 3: Exercise");
            System.out.println("Task 4: Take Shower");
            System.out.println("Task 5: Go to Office");
       };
        task.doTask();

        Calculate calculate = num -> num*num; //returns integer
        System.out.println(calculate.doCalculation(8)); //gives 8*8=64

        Calculator calculator = (num1, num2) -> num1 + num2;
        System.out.println(calculator.calculation(10,5));


    }
}
