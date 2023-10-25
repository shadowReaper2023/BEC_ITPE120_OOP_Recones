public class DayEnumDemo {
    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Days today = Days.WEDNESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("It's the start of the workweek.");
                break;
            case WEDNESDAY:
                System.out.println("It's hump day!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend.");
                break;
            default:
                System.out.println("It's a regular day.");
        }
    }
}