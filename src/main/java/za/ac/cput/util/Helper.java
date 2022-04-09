package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {
    public static String generateID() {
        return UUID.randomUUID().toString();
    }

    public static boolean isValidEmail(String emailAddress){
        EmailValidator validateEmail = EmailValidator.getInstance();
        return validateEmail.isValid(emailAddress);
    }

<<<<<<< HEAD
    public static boolean isNullOrEmpty(Object o)
    {
        return (o == null || o.equals(""));
    }

=======
    public static boolean isNull(String value) {
        return value == null;
    }

    public static boolean isEmpty(String value) {
        return value.equals("");
    }
>>>>>>> 4391050e21de7f31ea3d67cebe1b832a0a5660e8
}
