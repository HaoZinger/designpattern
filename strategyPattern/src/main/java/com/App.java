package com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        WorkStrategy strategy = new Walk();
        context context = new context(strategy);
        context.strategy();
        new context(new Drive()).strategy();
    }
}
