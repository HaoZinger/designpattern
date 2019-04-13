package com;

/**
 * Hello world!
 *
 */
public class ChainOfResponsibility
{
    public static void main( String[] args )
    {
        Leader teacher = new Teacher();
        Leader departmentHead = new DepartmentHead();
        Leader dean = new Dean();
        teacher.setNext(departmentHead);
        departmentHead.setNext(dean);
        teacher.handleRequest(80);

    }
}
