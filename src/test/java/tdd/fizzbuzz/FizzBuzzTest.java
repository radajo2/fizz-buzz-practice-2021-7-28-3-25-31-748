package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    void should_return_order_number_when_count_off_given_normal_case_order_number(){
        //given
        int orderNumber = 1;
        FizzBuzz fizzbuzz = new FizzBuzz();

        //when
        String result = fizzbuzz.countoff(orderNumber);

        //then
        assertThat(result).isEqualTo("1");

    }
}
