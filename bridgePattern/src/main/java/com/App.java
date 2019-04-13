package com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        Eatable eatWithChopsticks = new EatWithChopsticks();
        Eatable eatWithFork = new EatWithFork();
        Person chinese = new Chinese(eatWithChopsticks);
        Europe europe = new Europe(eatWithFork);
        Chinese chinese1 = new Chinese(eatWithFork);
        chinese.getEatable().eat();
        europe.getEatable().eat();
        chinese1.getEatable().eat();

    }
}
