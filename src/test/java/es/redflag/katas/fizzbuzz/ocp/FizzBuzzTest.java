package es.redflag.katas.fizzbuzz.ocp;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest
{
    public static final String FIZZ = Fizz.VALUE;
    public static final String BUZZ = Buzz.VALUE;
    public static final String BAZZ = Bazz.VALUE;

    public static final String FIZZBUZZ = FIZZ + BUZZ;

    private static List<Rule> RULES = Arrays.asList(
            new Fizz(),
            new Buzz(),
            new Bazz()
    );

    private FizzBuzz fizzBuzz;

    @Before
    public void init()
    {
        fizzBuzz = new FizzBuzz(RULES);
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
        assertThat(fizzBuzz.say(3), is(equalTo(FIZZ)));
        assertThat(fizzBuzz.say(6), is(equalTo(FIZZ)));
    }

    @Test
    public void shouldReturnBuzzWhenDivisibleByFive() throws Exception
    {
        assertThat(fizzBuzz.say(5), is(equalTo(BUZZ)));
        assertThat(fizzBuzz.say(10), is(equalTo(BUZZ)));
    }

    @Test
    public void shouldReturnBazzWhenDivisibleBySeven() throws Exception
    {
        assertThat(fizzBuzz.say(7), is(equalTo(BAZZ)));
        assertThat(fizzBuzz.say(14), is(equalTo(BAZZ)));
    }

    @Test
    public void shouldReturnFizzBuzzWhenDivisibleByThreeAndFive() throws Exception
    {
        assertThat(fizzBuzz.say(15), is(equalTo(FIZZBUZZ)));
    }
}
