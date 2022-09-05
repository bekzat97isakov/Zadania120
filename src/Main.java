public class Main {
    public static void main(String[] args) {
       Fish fish = new Fish("Sazan",2,"2 kg");
        System.out.println(fish.getName());
        System.out.println(fish.getAge());
        System.out.println(fish.getWeight());
        System.out.println("____________________________________");
        Popugai popugai = new Popugai("Kesha",3,"500g");
        System.out.println(popugai.getName());
        System.out.println(popugai.getAge());
        System.out.println(popugai.getWeight());
        System.out.println("____________________________________");
        Dog dog = new Dog("Taigan",5,"11 kg");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());
        System.out.println("____________________________________");
        Cat cat = new Cat("Murka",3,"1.5 kg");
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getWeight());
     System.out.println("______________________________________");

    }
}