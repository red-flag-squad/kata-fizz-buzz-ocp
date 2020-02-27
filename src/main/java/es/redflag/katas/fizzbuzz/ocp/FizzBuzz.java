package es.redflag.katas.fizzbuzz.ocp;

import java.util.List;

public class FizzBuzz
{
    private List<Rule> rules;

    public FizzBuzz(List<Rule> rules)
    {
        this.rules = rules;
    }

    public String say(int value)
    {
        String result = appy(this.rules, value);

        if (result.isEmpty())
        {
            result = String.valueOf(value);
        }

        return result;
    }

    private static String appy(List<Rule> rules, int value)
    {
        return rules.stream()
                .filter(rule -> rule.applies(value))
                .map(rule -> rule.execute(value))
                .reduce("", (accumul, item) -> accumul + item);
    }
}
