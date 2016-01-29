package ua.lesson.lessons;

/**
 * Created by Денис on 26.01.2016.
 */
public class Cat implements Pet{

   private String name;


    public Cat(final String name) {
        this.name = name;
    }


    public String getPetName() {
        return this.name;
    }
}
