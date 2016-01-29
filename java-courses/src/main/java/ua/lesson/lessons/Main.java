package ua.lesson.lessons;

public class Main {

    public static void main(String[] args) {
        Clinic clinic = new Clinic(10);


        clinic.addClient(4, new Client("Svetlana", new Cat("Kat")));
        clinic.addClient(0, new Client("Vasya", new Dog("Timka")));
        clinic.addClient(1, new Client("Denis", new Cat("Murzik")));
        clinic.addClient(2, new Client("Sasha", new Dog("Kira")));
        clinic.addClient(3, new Client("Andrey", new Cat("Lola")));

        clinic.play();



    }


}
