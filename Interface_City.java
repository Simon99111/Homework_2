public interface Interface_City extends Interface_Color{
    int year = 5;
    public void city(); //Город 
    
    default String sleep(){     //default-метод
        return ("Я сплю!");
    } 
}
