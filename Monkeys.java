/**
 * Created by Lori on 1/26/2017.
 */

public class Monkeys
{
    boolean MonkeyTrouble(boolean aSmile, boolean bSmile)
    {
        Monkey_A monkey_a = new Monkey_A();
        Monkey_B monkey_b = new Monkey_B();


        if ((monkey_a.IsSmiling(aSmile) == true && monkey_b.IsSmiling(bSmile) == true) ||
                (monkey_a.IsSmiling(aSmile) == false && monkey_b.IsSmiling(bSmile) == false))
            return true;

        return false;
    }

    public static void main(String[] args)
    {
        Monkeys monkey = new Monkeys();

        System.out.println(monkey.MonkeyTrouble(true,false));
    }

}
