public class Hero {

    private String name;
    private int age;
    private String power;

    public Hero(String name,int age,String power){
        this.name = name;
        this.age = age;
        this.power = power;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    String getPower(){
        return this.power;
    }
}
