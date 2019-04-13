package com;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args)

    {
        TestAC testAC = new TestAC();
        AC110 ac110 = new AC110();
        DC5adapter adapter110 = testAC.getPowerAdapter(ac110);
        adapter110.outputDC5(ac110);
        AC220 ac220 = new AC220();
        DC5adapter adapter220 = testAC.getPowerAdapter(ac220);
        adapter220.outputDC5(ac220);
    }
}
