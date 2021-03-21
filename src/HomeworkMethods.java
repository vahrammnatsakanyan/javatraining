public class HomeworkMethods {
    public static void main(String[] args) {
    }
    public int ageToDay(int age){
        int days = age * 365;
        return days;
    }

    public String checkAge(int age){
        if (age >= 18){
            return "Allowed";
        }else{
            return "Not Allowed";
        }
    }

    public String checkDay(int number){
        if (number == 1) {
            return "Monday";
        } else if(number == 2) {
            return "Tuesday";
        } else if(number == 3) {
            return "Wednesday";
        } else if(number == 4) {
            return "Thursday";
        } else if(number == 5) {
            return "Friday";
        } else if(number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else{
            return "invalid number";
        }
    }


}