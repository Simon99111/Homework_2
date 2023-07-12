import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Мурзик");
        cat1.setAge(3);

        Cat cat2 = new Cat();
        cat2.setName("Барсик");

        Cat cat3 = new Cat();
        cat3.setName("Буся");

        Owner own1 = new Owner();
        own1.setName("Yaroslav");
        own1.setAge(23);

        SummaAge summ = ()-> cat1.getAge() + own1.getAgeOwner(); //Определяем общий возраст кота и хозяина м помощью собственного функционального интерфейса SummaAge
        System.out.println("Общий возраст кота и хозяина: " + summ.getSummaAge() + " год(лет)");


        List<String> namesCat = new ArrayList<>(); //Создаем список имен животных по алфавиту
         namesCat.add(cat1.getName());
         namesCat.add(cat2.getName());
         namesCat.add(cat3.getName());

        Comparator<String> comparator = (a, b) -> a.compareTo(b);
        Collections.sort(namesCat, comparator);

        System.out.println(namesCat);
    }
}
