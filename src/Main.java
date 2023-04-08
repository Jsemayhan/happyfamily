public class Main {
    public static void main(String[] args) {
Pet pet=new Pet();
Human human = new Human();
pet.nickname="murad";
pet.species="dog";
pet.age=18;
pet.trickLevel=40;
pet.habits=new String[]{"play","eating"};
Pet pet2=new Pet("dog","cefer");
Pet pet3=new Pet("cat","nebi",5,50,new String[]{"eating","dying"});
Human mother=new Human("Sabina","Alizada",2004);
        System.out.println(pet2);
        System.out.println(mother);
        System.out.println(pet3);

        Pet.respond();
        Pet.foul();
        Pet.eat();
    }
}