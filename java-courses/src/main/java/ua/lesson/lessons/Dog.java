package ua.lesson.lessons;

/**
 * Created by Денис on 26.01.2016.
 */
public class Dog implements Pet {

   private String name;


    public Dog(final String name) {
        this.name = name;
    }


    public String getPetName() {
        return this.name;
    }

    public void setPetName(String name) {
        this.name = name;
    }
}
