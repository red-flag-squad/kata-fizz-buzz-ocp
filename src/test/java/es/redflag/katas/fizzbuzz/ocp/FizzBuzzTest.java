package es.redflag.katas.fizzbuzz.ocp;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest
{
    private FizzBuzz fizzBuzz;

    @Before
    public void init()
    {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void regularNumbersShouldReturnTheSameValue() throws Exception
    {
        assertThat(fizzBuzz.say(1), is(equalTo("1")));
        assertThat(fizzBuzz.say(2), is(equalTo("2")));
    }

    @Test
    public void shouldReturnFizzWhenDivisibleByThree() throws Exception
    {
        assertThat(fizzBuzz.say(3), is(equalTo("Fizz")));
        assertThat(fizzBuzz.say(6), is(equalTo("Fizz")));
    }

    @Test
    public void shouldReturnBuzzWhenDivisibleByFive() throws Exception
    {
        assertThat(fizzBuzz.say(5), is(equalTo("Buzz")));
        assertThat(fizzBuzz.say(10), is(equalTo("Buzz")));
    }

    @Test
    public void shouldReturnFizzBuzzWhenDivisibleByThreeAndFive() throws Exception
    {
        assertThat(fizzBuzz.say(15), is(equalTo("FizzBuzz")));
    }
}
