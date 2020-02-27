package es.redflag.katas.fizzbuzz.ocp;

class Buzz implements Rule
{
    public static final String VALUE = "Buzz";

    public boolean applies(int value)
    {
        return value % 5 == 0;
    }

    public String execute(int value)
    {
        return VALUE;
    }
}