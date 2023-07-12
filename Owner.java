public class Owner implements Interface_City{
    private String nameOwner;
    private int ageOwner;

    public void setName (String name){
        this.nameOwner = name;
    }

    public void setAge (int age){
        this.ageOwner = age;
    }

    public String getName() {
        return nameOwner;
    }

    public int getAgeOwner() {
        return ageOwner;
    }

    @Override
    public void city(){
        System.out.println("Ярославль");
    }

    @Override
    public void color(){
        System.out.println("Белый");
    }

    @Override
    public void placeBorn(){
        System.out.println("Тундра");
    }

    @Override
    public void tail(){
        System.out.println("У меня нет хвоста");
    }

    @Override
    public void abilityToSpeak(){
        System.out.println("Я умею говорить!");
    }

    
}
