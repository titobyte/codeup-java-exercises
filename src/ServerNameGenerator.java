import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives =
                {"cloudy",
                "lovely",
                "tall",
                "cool",
                "rotten",
                "loud",
                "soft",
                "short",
                "mad",
                "funny"};

        String[] nouns =
                {"cat",
                "sock",
                "ship",
                "hero",
                "monkey",
                "baby",
                "match",
                "texas",
                "guitar",
                "car"};

        Random random = new Random();
        int indexAdj = random.nextInt(adjectives.length);
        int indexNouns = random.nextInt(nouns.length);
        System.out.println("Here is your server name: ");
        System.out.println(adjectives[indexAdj] +"-"+ nouns[indexNouns]);

    }

}
