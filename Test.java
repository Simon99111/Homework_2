/**
 * Создайте класс "Кот" (Cat) со следующими свойствами:
Приватное поле "имя" (name) типа String для хранения имени кота.
Приватное поле "возраст" (age) типа int для хранения возраста кота.
Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида 
"Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
Дополнительное задание:
Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. 
Добавьте соответствующее поле в классе "Кот" и методы доступа для него. 
Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида 
"Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".
 */
public class Test implements Interface_IConst {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Мурзик");
        cat1.setAge(3);

        Owner owner = new Owner();
        owner.setName("Олег");
        cat1.setOwnerName(owner.getName());


        System.out.println("Из какого ты города?");//Interface_City
        System.out.print("Кот: ");
        cat1.city();
        System.out.print("Человек: ");    
        owner.city();

        System.out.println();

        System.out.println("Какого ты цвета?");//Interface_Color
        System.out.print("Кот: ");
        cat1.color();
        System.out.print("Человек: ");
        owner.color();

        System.out.println();

        System.out.println("Где ты родился?"); //Interface_PlaceBorn
        System.out.print("Кот: ");
        cat1.placeBorn();
        System.out.print("Человек: ");
        owner.placeBorn();

        System.out.println();

        System.out.println("У тебя есть хвост?");//Interface_Tail
        System.out.print("Кот: ");
        cat1.tail();
        System.out.print("Человек: ");
        owner.tail();

        System.out.println();

        System.out.println("Умеешь говорить?");//Interface_AbilityToSpeak
        System.out.print("Кот: ");
        cat1.abilityToSpeak();
        System.out.print("Человек: ");
        owner.abilityToSpeak();

        System.out.println();

        System.out.println("В каком году тебя опросили?");//Интерфейс 1 (год опроса)
        System.out.println("Кот: " + YEAR);
        System.out.println("Человек: " + YEAR);
        System.out.println();
        
        Cat obj1 = new Cat();       //Default-методы
        Owner obj2 = new Owner();


        System.out.println("Что делаешь?");
        System.out.print("Кот: " + obj1.sleep());
        System.out.println();
        System.out.print("Человек: " + obj2.sleep());
    }
}
