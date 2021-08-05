package tdd.fizzbuzz;

public class FizzBuzzWhizz {

    public String countoff(int orderNumber) {
        if (orderNumber%3 == 0){
            return "Fizz";
        }
        if (orderNumber%5 == 0){
            return "Buzz";
        }
        if (orderNumber%7 == 0){
            return "Whizz";
        }
        return String.valueOf(orderNumber);

    }
}
