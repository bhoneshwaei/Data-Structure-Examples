package String;

public class ImmutableStrinIn {

    public static void main(String[] args) {

        String s = "Hello";

        s.concat(" World");

        System.out.println(s);

        s = s.concat(" World");

        System.out.println(s);
    }
}
