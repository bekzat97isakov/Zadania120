public class Popugai {
    private String name;
    private int age;
    private String  weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Popugai" +'\n'+
                "name: "+ name + '\n' +
                "age:  " + age +'\n'+
                "weight:  " + weight ;
    }

    public Popugai(String name, int age, String weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
}
