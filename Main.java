public class Main
{
    public static void main(String[] args)
    {
        Feeder x = new Feeder(500);
        x.simulateOneDay(12);
        System.out.println(x);
        Feeder y = new Feeder(1000);
        y.simulateOneDay(22);
        System.out.println(y);
        Feeder z = new Feeder(100);
        z.simulateOneDay(5);
        System.out.println(z);

        Feeder a = new Feeder(0);
        System.out.println(a.simulateManyDays(5,10));
        Feeder b = new Feeder(250);
        System.out.println(b.simulateManyDays(10,5));
        Feeder c = new Feeder(2400);
        System.out.println(c.simulateManyDays(10,4));
        

        

    }
}
