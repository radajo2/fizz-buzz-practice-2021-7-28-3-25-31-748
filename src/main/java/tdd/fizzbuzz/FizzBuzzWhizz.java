package tdd.fizzbuzz;

public class FizzBuzzWhizz {

    public String countoff(int orderNumber) {
        if (orderNumber%3 == 0){
            return "Fizz";
        }
        if (orderNumber%5 == 0){
            return "Buzz";
        }
        return String.valueOf(orderNumber);

    }
}
