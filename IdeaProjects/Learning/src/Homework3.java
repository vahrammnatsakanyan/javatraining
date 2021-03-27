public class Homework3 {

    public static void main(String[] args) {
        System.out.println(changeToUppercase("test"));
        System.out.println(ageToDay(2));
        System.out.println(checkDay(2));
    }

    public static int ageToDay(int age) {
        return age * 365;
    }

    public static String checkDay(int number) {

        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "invalid number";
        }
    }

    public static String changeToUppercase(String word) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            int x = word.charAt(i) - 32;
            newWord += (char)x;
        }
        return  newWord;
    }

}

