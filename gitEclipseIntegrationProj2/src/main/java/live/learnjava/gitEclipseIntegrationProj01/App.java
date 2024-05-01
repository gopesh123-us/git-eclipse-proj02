package live.learnjava.gitEclipseIntegrationProj01;

import live.learnjava.gitEclipseIntegrationProj01.beans.Employee;
import live.learnjava.gitEclipseIntegrationProj01.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student student = new Student("Ram Kumar");
        System.out.println(student);
        Employee emp = new Employee("Adam Smith");
        System.out.println(emp);
    }
}
