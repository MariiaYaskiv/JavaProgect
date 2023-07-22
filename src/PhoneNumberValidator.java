import java.util.regex.Pattern;

public class PhoneNumberValidator {
    public static boolean isValidUkrainianPhoneNumber(String phoneNumber) {
        String regex = "\\+380\\d{9}";
        return Pattern.matches(regex, phoneNumber);
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+380987654321";
        String phoneNumber2 = "+3801234567890";
        String phoneNumber3 = "+38012345";
        String phoneNumber4 = "+38012345sdfg";
        String phoneNumber5 = "+38012345*/-+";
        String phoneNumber6 = "+3412345163";

        System.out.println(phoneNumber1 + " is valid: " + isValidUkrainianPhoneNumber(phoneNumber1));
        System.out.println(phoneNumber2 + " is valid: " + isValidUkrainianPhoneNumber(phoneNumber2));
        System.out.println(phoneNumber3 + " is valid: " + isValidUkrainianPhoneNumber(phoneNumber3));
        System.out.println(phoneNumber4 + " is valid: " + isValidUkrainianPhoneNumber(phoneNumber4));
        System.out.println(phoneNumber5 + " is valid: " + isValidUkrainianPhoneNumber(phoneNumber5));
        System.out.println(phoneNumber6 + " is valid: " + isValidUkrainianPhoneNumber(phoneNumber6));
    }
}
