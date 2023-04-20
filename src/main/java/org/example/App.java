package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String [] capitols = new String[]{"Barcelona","London","Athen"};
        for(Integer i=0;i< capitols.length; i++){
            String capitol=capitols[i];
            System.out.println((i+1+" "+capitol));
        }

        //Zadanie 3:        Stwórz tablicę liczb zmiennoprzecinkowych i następnie oblicz sumę oraz średnią tych liczb.
        System.out.println( "Give me numbers:" );
        Float [] numbers=new Float[3];
    }
}
