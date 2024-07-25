package lab_session02;

import java.util.Random;

public class generateRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int firstPart = 100 + random.nextInt(900);
        int secondPart = 100 + random.nextInt(900);
        int thirdPart = 1000 + random.nextInt(9000);
        String phoneNumber = firstPart + "-" + secondPart + "-" + thirdPart;

    }
}
