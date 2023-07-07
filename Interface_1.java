public interface Interface_1 extends Interface_2{
    int year = 5;
    public void City(); //Город 
    
    default String sleep(){     //default-метод
        return ("Я сплю!");
    } 
}
