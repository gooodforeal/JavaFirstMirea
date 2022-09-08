package ru.mirea.task4;


class Author {
    private String name;
    private String email;
    private char gender;

    Author(String argName, String argEmail, char argGender) {
        name = argName;
        email = argEmail;
        gender = argGender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author: name=" + name + ", email=" + email + ", gender=" + gender;
    }
}


public class TestAuthor {
    public static void main(String[] args) {
        Author objectAuthor = new Author("Иван", "", 'М');
        objectAuthor.setEmail("vanya78@mail.ru");
        System.out.println(objectAuthor.toString());
    }
}
