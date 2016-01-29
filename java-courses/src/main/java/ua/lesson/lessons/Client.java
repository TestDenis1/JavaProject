package ua.lesson.lessons;

import java.util.Scanner;

/**
 * Created by Денис on 26.01.2016.
 */
public class Client {

    private  String nameId;
    private  Pet pet;
    Scanner sc;

    public Client(String nameId, Pet pet) {
        this.nameId = nameId;
        this.pet = pet;
    }

    public String getNameId(){
        return this.nameId;
    }

    public void setNameId(final String nameId){
        this.nameId = nameId;
    }

    public Pet getPet(){
        return this.pet;
    }

    public void setPet(final Pet pet){
        this.pet = pet;
    }







}
