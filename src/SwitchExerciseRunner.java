public class SwitchExerciseRunner {
    public static void main(String[] args) {
        System.out.println(determineNameOfDay(0));
        System.out.println(isWeekDay(7));
        System.out.println(determindNameOfMonth(7));


    }

    public static String determindNameOfMonth(int dayNumber){
        String result ="";
        switch(dayNumber){
            case 0: return "1월";
            case 1: return "2월";
            case 2: return "3월";
            case 3: return "4월";
            case 4: return "5월";
            case 5: return "6월";
            case 6: return "7월";
            case 7: return "8월";
            case 8: return "9월";
            case 9: return "10월";
            case 10: return "11월";
            case 11: return "12월";


        }
        return "is not a month";
    }
    public static boolean isWeekDay(int dayNumber) {


        switch (dayNumber) {

            case 0,6:
                return true;
            case 1,2,3,4,5:
                return false;


        }
        return false;
    }

    public static String determineNameOfDay(int dayNumber) {
        String result = "";
        switch (dayNumber) {
            case 0:
                return "Sunday"; // 브레이크 대신 메소드를 이용하여 더 간결하게 정리 가능
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Thursday";
                break;
            case 4:
                result = "Wendsday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";

        }
        return result;
    }
}
