package ua.lesson.lessons;

import java.util.Scanner;

/**
 * Created by Денис on 26.01.2016.
 */
public class Clinic {



    private final Client[] clients;
    Scanner sc = new Scanner(System.in);
    Client client;
    Clinic clinic;
    String exit = "no";

    public Clinic(final int size) {
        this.clients = new Client[size];
    }

    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }



    public void showAllClients() {
        System.out.println("List all clients:");
        System.out.println("====================================");
        Client[] clients = this.clients;
        for (Client client : clients) {
            if (client != null) {
                Pet pet = client.getPet();
                System.out.print("Client : " + client.getNameId());
                if (pet != null) {
                    System.out.println(" have " + pet.getPetName() + "( " + pet.getClass().getSimpleName() + " )");
                    System.out.println("====================================");
                }
            }

        }
    }

    public void addNewClient() {
        System.out.println("Enter name client");
        String nameId = sc.next();
        Pet pet = addNewPet();
        System.out.println("Введите id");
        int index = sc.nextInt();
        this.clinic.addClient(index, new Client(nameId, pet));
        System.out.println("The client added");
    }


    public Pet addNewPet() {

        System.out.println("dog or cat ?");
        String petClass = sc.next();
        while (!petClass.equals("dog") && !petClass.equals("cat")) {
            System.err.println("Вы ввели некорректные данные , попробуйте еще раз.");
            petClass = sc.next();
        }
        System.out.println("Enter name pet");
        String name = sc.next();
        Pet pet = null;
        if (petClass.equals("dog")) {
            pet = new Dog(name);
        } else if (petClass.equals("cat")) {
            pet = new Cat(name);
        }
        return pet;

    }

    public void findPetByClientName(){
        System.out.println("Введите имя Клиента");
        String nameId = sc.next();
        for(Client client : clients){
            if(client != null){
                if(client.getNameId().equals(nameId)){
                    System.out.println("Клиенту " + nameId + " принадлежит " + client.getPet().getPetName());
                }
            }
        }
    }

    public void findClientByPetName(){
        System.out.println("Введите имя животного:");
        String petName = sc.next();
        for(Client client : clients){
            if(client != null){
                if(client.getPet().getPetName().equals(petName)){
                    System.out.println("Владельцем питомца " + petName + " является " + client.getNameId());
                }
            }
        }
    }

    public void removeClient() {
        boolean removedClient = false;
        System.out.println("Введите имя клиента которого хотите удалить :");
        String nameClient = sc.next();
        for (Client client : clients) {
            if (this.client != null && this.client.getNameId().equals(nameClient)) {
                this.client = null;
                System.out.println(client);
            }
        }
    }


    public void changeNameClient(){
        System.out.println("Введите им клиента для редактирования:" );
        String changeName = sc.next();
        System.out.println("Введите новое имя");
        String newName = sc.next();
        System.out.println("Имя успешно изменено. ");
        for(Client client : clients){
            if(this.client != null && this.client.getNameId().equals(changeName)){
                this.client.setNameId(newName);
            }
        }
    }

    public void changePetname(){

    }

    public void menu(){
        System.out.println("==================================================================");
        System.out.println("Выберете нужную вам операцию");
        System.out.println("==================================================================");
        System.out.println("");
        System.out.println("Нажмите цифру 1, если хотите увидеть весь список клиентов: ");
        System.out.println("Нажмите цифру 2, если хотите найти петомца по имени клиента: ");
        System.out.println("Нажмите цифру 3, если хотите найти клиента по кличке петомца: ");
        System.out.println("Нажмите цифру 4, если хотите добавить нового клиента : ");
        System.out.println("Нажмите цифру 5, если хотите удалить клиента из списка: ");
        System.out.println("Нажмите цифру 6, если хотите редактировать имя клиента : ");
        System.out.println("Нажмите цифру 7, если хотите редактировать имя питомца : ");
        System.out.println("===================================================================");

    }


    public void play(){
        System.out.println("Введите ваше имя ");
        String nameUsers = sc.next();
        System.out.println("Здравствуйте " + nameUsers  );
        while(exit.equals("no")) {
            menu();
            int operations = sc.nextInt();
            switch (operations) {
                case 1:
                    showAllClients();
                    break;
                case 2:
                    findPetByClientName();
                    break;
                case 3:
                    findClientByPetName();
                    break;
                case 4:
                    addNewClient();
                    break;
                case 5:
                    removeClient();
                    break;
                case 6:
                    changeNameClient();
                    break;
                default:
                    System.out.println(nameUsers + " Вы ввели неправильную цифру. Попробуйте еще раз");
            }
            System.out.println(nameUsers + " Хотите выйти с этой программы?(yes / no)");
            exit = sc.next();
            if(exit.equals("yes")){
                sc.close();
                System.out.println("Good Luck!!!" + nameUsers);
            }

        }
    }



}
