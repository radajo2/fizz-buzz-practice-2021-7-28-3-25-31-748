package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    void should_return_order_number_when_count_off_given_normal_case_order_number(){
        //given
        int orderNumber = 1;
        FizzBuzzWhizz fizzbuzz = new FizzBuzzWhizz();

        //when
        String result = fizzbuzz.countoff(orderNumber);

        //then
        assertThat(result).isEqualTo("1");

    }
    @Test
    void should_return_fizz_when_count_off_given_order_number_multiple_of_3(){
        //given
        int orderNumber = 3;
        FizzBuzzWhizz fizzbuzz = new FizzBuzzWhizz();

        //when
        String result = fizzbuzz.countoff(orderNumber);

        //then
        assertThat(result).isEqualTo("Fizz");

    }
    @Test
    void should_return_buzz_when_count_off_given_order_number_multiple_of_5(){
        //given
        int orderNumber = 5;
        FizzBuzzWhizz fizzbuzz = new FizzBuzzWhizz();

        //when
        String result = fizzbuzz.countoff(orderNumber);

        //then
        assertThat(result).isEqualTo("Buzz");

    }
    @Test
    void should_return_whizz_when_count_off_given_order_number_multiple_of_7(){
        //given
        int orderNumber = 7;
        FizzBuzzWhizz fizzbuzz = new FizzBuzzWhizz();

        //when
        String result = fizzbuzz.countoff(orderNumber);

        //then
        assertThat(result).isEqualTo("Whizz");

    }

}
