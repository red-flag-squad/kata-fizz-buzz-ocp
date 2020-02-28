package es.redflag.katas.fizzbuzz.ocp;

public class FizzBuzz
{
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static final String FIZZBUZZ = FIZZ + BUZZ;

    public String say(int value)
    {
        if (isFizz(value) && isBuzz(value)) return FIZZBUZZ;
        if (isFizz(value)) return FIZZ;
        if (isBuzz(value)) return BUZZ;

        return String.valueOf(value);
    }

    private boolean isBuzz(int value)
    {
        return value % 5 == 0;
    }

    private boolean isFizz(int value)
    {
        return value % 3 == 0;
    }
}
