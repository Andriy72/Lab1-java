public class Main {

    public static void main(String[] args) {
        Clown Jack = new Clown();
        Clown Jake = new Clown("red", 10, true, true);
        Clown Joke = new Clown("green", 3, true, false, "red");

        System.out.println(Jack.toString());
        System.out.println(Jake.toString());
        System.out.println(Joke.toString());
        Jack.printSum();
        Jake.printSum();
        Joke.printSum();
		Joke.printStaticSum();

    }
}
