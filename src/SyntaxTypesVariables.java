public class SyntaxTypesVariables {

    public static void main(String[] args) {

        //JS Variable Declaration
        //let something = value

        //Java Variable Declaration
        // datatype -> name = value

        byte daysOfMonth = 31;

        short employees = 10000;

        int userID = 1000000;

        //LONG needs to be suffixed with an "L"
        long circMilkyWay = 100000000000L;

        //FLOAT needs to be suffixed with an "F"
        float roundedPi = 3.14F;

        double someBigDecimal = 3.1415900001;

        //CHAR is one character and uses single quotes
        char yesNo = 'Y';

        boolean jamesLikesCookies = true;

        boolean jamesHatesPizza = false;

        String myString = "Some string thing";

        String someQuote = "\"Ich bin ein berliner\"";
        String backslashes = "I can do backslash \\, double backslash \\\\, and triple backslash \\\\\\";

        System.out.print(someQuote + "\n" + backslashes + "\n");

        final int SIDES_OF_A_DICE = 6;
        final String API_KEY = "b75b703d8195f6f433ca";
        final String GITHUB_API_BASE_URL = "https://api.github.com";

        int sum = 1 + 1;
        int anotherSum = 1 + 1;

        double pi = 3.14159;
        int almostPi = (int) pi;

        System.out.println(almostPi);

        //Post Increment
        System.out.println(sum++);

        System.out.println(sum);

        //Pre Increment
        System.out.println(++anotherSum);
    }
}
