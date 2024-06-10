package JavaCoreLabs.Conditional_Statements;

public class Switch_Statement {

    public static void main(String[] args) {

        String day = "Saturday";

        switch (day) {

            case "Sunday":
                System.out.println("It's Sunday");
                break;
            case "Monday":
                System.out.println("It's Monday");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday");
                break;
            case "Wedensday":
                System.out.println("It's Wedensday");
                break;
            case "Thursday":
                System.out.println("It's Thursday");
                break;
            case "Friday":
                System.out.println("It's Friday");
                break;
            case "Saturday":
                System.out.println("It's Saturday");
                break;
            default:
                System.out.println(day + " is not a day");

        }
    }

}
