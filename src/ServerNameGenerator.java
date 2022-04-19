public class ServerNameGenerator {
    public static void main(String[] args) {
        randomServerName(adjectives, nouns);


        System.out.println("\nHere is your server name:");
        System.out.printf("%s-%s%n", randomAdjective(adjectives), randomNoun(nouns));

    }

    private static String[] adjectives = {"Cheesy", "Sexy", "Inept", "Lackadaisical", "Grumpy",
                            "Weird", "Nerdy", "Ancient", "Loyal", "Communist"};

    private static String[] nouns = {"Drone", "Kangaroo", "Limousine", "Goose", "Jackal", "Tree",
                        "Egret", "Lamborghini", "Ocelot", "Compiler"};

    public static void randomServerName(String[] adArray, String[] nounArray){
        int randAd = (int) (Math.random() * (adArray.length - 1)) + 1;
        int randNo = (int) (Math.random() * (nounArray.length - 1)) + 1;
        String adjective = adArray[randAd];
        String noun = nounArray[randNo];
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s%n", adjective, noun);
    }

    public static String randomAdjective(String[] adArray){
        int rand = (int) (Math.random() * (adArray.length - 1)) + 1;
        return adArray[rand];
    }

    public static String randomNoun(String[] nounArray){
        int rand = (int) (Math.random() * (nounArray.length - 1)) + 1;
        return nounArray[rand];
    }
}


