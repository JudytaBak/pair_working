package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {


        System.out.println("Hello World!");
        String[] capitols = new String[]{"Barcelona", "London", "Athen"};
        for (Integer i = 0; i < capitols.length; i++) {
            String capitol = capitols[i];
            System.out.println((i + 1 + " " + capitol));
        }

        //Zadanie 3:        Stwórz tablicę liczb zmiennoprzecinkowych i następnie oblicz sumę oraz średnią tych liczb.

        Float[] numbers = new Float[3];
        numbers[0] = 0.5f;
        numbers[1] = 0.7f;
        numbers[2] = 0.9f;
for(int i=0;i<3;i++)
{  System.out.println  (numbers[i]);}
Float sum=numbers[0]+numbers[1]+ numbers[2];
        {  System.out.println  (sum);}
        Float average=sum/3;
        {  System.out.println  (average);}
    }
}
