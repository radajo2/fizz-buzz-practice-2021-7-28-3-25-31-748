package tdd.fizzbuzz;

public class FizzBuzzWhizz {

    public String countoff(int orderNumber) {
        if (orderNumber%3 == 0){
            return "Fizz";
        }
        return String.valueOf(orderNumber);

    }
}
