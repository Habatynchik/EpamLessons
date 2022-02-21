package epam.lessons.lesson2.Notebook.Model;

public class Regex {

    String REGEX_SURNAME = "^([a-z]|[A-Z]){1,20}";

    String REGEX_NAME = "^[A-Z][a-z]{1,20}";

    String REGEX_SECOND_NAME = "^([a-z]|[A-Z]| ){1,20}";

    String REGEX_PHONE_NUMBER = "^([+]\\d{2})?\\d{10}$";

    String REGEX_EMAIL = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,63}$";
}
