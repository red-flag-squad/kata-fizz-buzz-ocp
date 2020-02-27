package es.redflag.katas.fizzbuzz.ocp;

class Fizz implements Rule
{
    public static final String VALUE = "Fizz";

    public boolean applies(int value)
    {
        return value % 3 == 0;
    }

    public String execute(int value)
    {
        return VALUE;
    }
}
