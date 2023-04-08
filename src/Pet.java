import java.lang.reflect.Array;
import java.util.Arrays;

public class Pet {
  String species;
  String nickname;
  int age;
  int trickLevel;
  String[] habits;
public static void eat(){
    System.out.println("I am eating");
}
public  static void respond(){
    System.out.println("Hello,owner.I am-[the name of the pet].I miss you!");
}
public static void foul(){
    System.out.println("I need to cover it up");
}
    public Pet() {
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
}
