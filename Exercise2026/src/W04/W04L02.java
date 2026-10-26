package W04;


public class W04L02 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 6);

        if (number == 0) {
            System.out.println(number + " is zero");
        } else if (number == 1) {
            System.out.println(number + " is one");
        } else if (number == 2) {
            System.out.println(number + " is two");
        } else if (number == 3) {
            System.out.println(number + " is three");
        } else if (number == 4) {
            System.out.println(number + " is four");
        } else {
            System.out.println(number + " is five");
        }
    }
}
