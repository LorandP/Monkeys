/**
 * Created by Lori on 1/29/2017.
 */
public class Application
{
    private boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
        Monkey monkey_a = new Monkey(aSmile);
        Monkey monkey_b = new Monkey(bSmile);


        if (monkey_a.getValue() == monkey_b.getValue())
            return true;

        return false;
    }
    public static void main (String []args)
    {
        Application application = new Application();

        System.out.println(application.monkeyTrouble(true,true));
    }
}
