public class Cat implements Interface_City{
    private String name;
    private int age;
    private String ownerName;

    public void setName (String name){
        this.name = name;
    }

    public void setAge (int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void Greet(){
        System.out.println("Мяу! Меня зовут " + name + "! Мне " + age + " года(лет). Мой хозяин - " + ownerName + ".");
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    @Override
    public void city(){
        System.out.println("Я бездомный");
    }

    @Override
    public void color(){
        System.out.println("Черный");
    }

    @Override
    public void placeBorn(){
        System.out.println("Я не помню");
    }

    @Override
    public void tail(){
        System.out.println("У меня длинный хвост");
    }

    @Override
    public void abilityToSpeak(){
        System.out.println("Я только мяукаю");
    }


}


