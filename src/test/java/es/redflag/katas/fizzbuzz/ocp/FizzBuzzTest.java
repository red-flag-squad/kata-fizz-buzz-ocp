package es.redflag.katas.fizzbuzz.ocp;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest
{
    @Test
    public void regularNumbersShouldReturnTheSameValue() throws Exception
    {
        assertThat(FizzBuzz.say(1), is(equalTo("1")));
        assertThat(FizzBuzz.say(2), is(equalTo("2")));
    }

    @Test
    public void shouldReturnFizzWhenDivisibleByThree() throws Exception
    {
        assertThat(FizzBuzz.say(3), is(equalTo("Fizz")));
        assertThat(FizzBuzz.say(6), is(equalTo("Fizz")));
    }

    @Test
    public void shouldReturnBuzzWhenDivisibleByFive() throws Exception
    {
        assertThat(FizzBuzz.say(5), is(equalTo("Buzz")));
        assertThat(FizzBuzz.say(10), is(equalTo("Buzz")));
    }

    @Test
    public void shouldReturnFizzBuzzWhenDivisibleByThreeAndFive() throws Exception
    {
        assertThat(FizzBuzz.say(15), is(equalTo("FizzBuzz")));
    }
}
