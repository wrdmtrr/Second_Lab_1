import java.lang.String;
import java.util.Scanner;

public class TestAuthor {

    public static void main(String[] args)
    {

        Author Person = new Author();
        Scanner source = new Scanner(System.in);
        Person.setName("Влад Иванов");
        Person.setEmail("vladboss228@gmail.com");
        Person.setGender('m');

        System.out.println(Person.toString());



    }
}
