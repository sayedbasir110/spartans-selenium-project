package lab_session01.ActivityOne;

import java.util.Random;

public class GenerateRandomEmail {
    private static final String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String generateRandomString(){
        Random random = new Random();
        StringBuilder string = new StringBuilder(10);
        for (int i = 0; i < 10; i++) string.append(characters.charAt(random.nextInt(characters.length())));
        return string.toString();

    }
    public static String generateRandomEmail(){
        String localPart = generateRandomString();
        return localPart + "@gmail.com";
    }
}
