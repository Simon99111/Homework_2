public class Owner_1 implements Interface_1{
    private String name;

    public void setName (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void City(){
        System.out.println("Ярославль");
    }

    @Override
    public void Color(){
        System.out.println("Белый");
    }

    @Override
    public void PlaceBorn(){
        System.out.println("Тундра");
    }

    @Override
    public void Tail(){
        System.out.println("У меня нет хвоста");
    }

    @Override
    public void AbilityToSpeak(){
        System.out.println("Я умею говорить!");
    }

    
}
