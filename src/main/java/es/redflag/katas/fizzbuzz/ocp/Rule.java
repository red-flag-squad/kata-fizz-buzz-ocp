package es.redflag.katas.fizzbuzz.ocp;

public interface Rule
{
    boolean applies(int value);

    String execute(int value);
}
