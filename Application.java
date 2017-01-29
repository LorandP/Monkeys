/**
 * Created by Lori on 1/29/2017.
 */
public class Application
{
    private boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
        Monkey monkey_a = new Monkey();
        Monkey monkey_b = new Monkey();

        if (monkey_a.isSmiling(aSmile) == monkey_b.isSmiling(bSmile))
            return true;

        return false;
    }
    public static void main (String []args)
    {
        Application application = new Application();

        System.out.println(application.monkeyTrouble(true,false));
    }
}
