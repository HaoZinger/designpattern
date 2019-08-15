package com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TeamLeader teamLeader = new TeamLeader();
        Teacher teacher = new Teacher();
        Dean dean = new Dean();
        teamLeader.setNext(teacher);
        teacher.setNext(dean);
        teamLeader.approveDay(2);
        teamLeader.approveDay(5);
        teamLeader.approveDay(7);
        teamLeader.approveDay(16);

    }
}
