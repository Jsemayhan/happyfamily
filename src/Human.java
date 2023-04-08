import java.util.Arrays;

public class Human {
    String name;
    String surname;
    int data_of_birth;
    int IQ_level;
    Pet pet;
    Human mother;
    Human father;
    int Schedule [][];
    public void greetPet(){
        System.out.println ("Hello"+ name);

    }
    public  void describePet(){
        System.out.println("I have a"+pet.species+","+pet.age+","+"he is"+pet.trickLevel);

    }
    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", data_of_birth=" + data_of_birth +
                ", IQ_level=" + IQ_level +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", Schedule=" + Arrays.toString(Schedule) +
                '}';
    }

    public Human(String name, String surname, int data_of_birth) {
        this.name = name;
        this.surname = surname;
        this.data_of_birth = data_of_birth;
    }

    public Human(String name, String surname, int data_of_birth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.data_of_birth = data_of_birth;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int data_of_birth, int IQ_level, Pet pet, Human mother, Human father, int[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.data_of_birth = data_of_birth;
        this.IQ_level = IQ_level;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        Schedule = schedule;
    }
}
