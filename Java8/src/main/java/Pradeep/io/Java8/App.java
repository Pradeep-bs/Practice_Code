package Pradeep.io.Java8;

public class App 
{
    public static void main( String[] args )
    {
     
        lambda MyFirstLambda = () -> System.out.println( "Hello World!" );
        MyFirstLambda.sysout();
    }
}

interface lambda {
	void sysout();
}