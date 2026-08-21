/*
A string is a class and can be used as a datatype of
sequence of characters.
 */

public class basics_of_strings {
    public static void main(String[] args) {
   String name=new String(" Waris Mittal");
   System.out.println(name);
   System.out.println(" String.length " + name.length());
   System.out.println(" String.toLowerCase " + name.toLowerCase());
   System.out.println(" String.toUpperCase " + name.toUpperCase());
   System.out.println(" String.trim " + name.trim());
   System.out.println(" String.substring from starting 3rd place " + name.substring(3));
   System.out.println(" String.substring from starting 3rd place and ending at 10th place " + name.substring(3,10));
   System.out.println(" String.replace w with m " + name.replace('W','M'));
   System.out.println(" String.replace w with mit " + name.replace("W","Mit"));
   System.out.println(" String.startsWith W " + name.startsWith(" War"));
   System.out.println(" String.endsWith l " + name.endsWith("al"));
   System.out.println(" String.charAt 3 " + name.charAt(3));
   System.out.println(" String.indexOf M " + name.indexOf('M'));

   int a=5;
   int b=6;
   /* we have to use \\ to get \ */
   System.out.printf(" Number a :%d \\\n number b: %d \\\n string is: %s ",a,b,name);

    }
}