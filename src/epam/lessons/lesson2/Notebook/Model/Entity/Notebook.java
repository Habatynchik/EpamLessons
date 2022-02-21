package epam.lessons.lesson2.Notebook.Model.Entity;

/**
 * Entity notebook
 *
 * @author Nikita Gamaiunov
 * @version 1.0
 * @since 2022-02-21
 */
public class Notebook {
    private String surname;
    private String name;
    private String secondName;
    private String phoneNumber;
    private String email;


    /**
     * Initialize new object of Notebook without params.
     */
    public Notebook() {
    }

    /**
     * Initialize new object of Notebook with params.
     *
     * @param surname representing surname
     * @param name representing name
     * @param secondName representing secondName
     * @param phoneNumber representing phoneNumber
     * @param email representing email
     */
    public Notebook(String surname, String name, String secondName, String phoneNumber, String email) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * @return String representing surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname string representing surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return String representing name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name string representing name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String representing secondName
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * @param secondName string representing secondName
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * @return String representing phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber string representing phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return String representing email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email string representing email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
