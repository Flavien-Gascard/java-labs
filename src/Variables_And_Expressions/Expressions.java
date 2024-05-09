package Variables_And_Expressions;

public class Expressions {

    public static void main(String[] args) {
        // Experssions = operands and operatrors
        // operands = values, variables, numbers, quantity
        // operators = + - * / %
        int countOfFriends = 10;
        // shorthand to increase by one (can also -- to decrease by one)
        countOfFriends++;
        int divisor = 2;

        int countOfFriendsDivision = countOfFriends / divisor;
        int countOfFriendsModulus = countOfFriends % divisor;

        System.out.println(countOfFriends);
        System.out.println(countOfFriendsDivision);
        System.out.println(countOfFriendsModulus);
        System.out.println(countOfFriends
                + " Divided by "
                + divisor
                + " is "
                + countOfFriendsDivision
                + " with a remainder of "
                + countOfFriendsModulus);

    }

}
