public class Hero {

    private String name;
    private int age;
    private String power;
    private String weakness;

    public Hero(String name,int age,String power, String weakness){
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
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
    String getWeakness(){
        return this.weakness;
    }
}
