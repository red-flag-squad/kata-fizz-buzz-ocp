package es.redflag.katas.fizzbuzz.ocp;

class Bazz implements Rule
{
    public static final String VALUE = "Bazz";

    public boolean applies(int value)
    {
        return value % 7 == 0;
    }

    public String execute(int value)
    {
        return VALUE;
    }
}