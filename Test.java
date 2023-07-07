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
        Cat_1 cat1 = new Cat_1();
        cat1.setName("Мурзик");
        cat1.setAge(3);

        Owner_1 owner = new Owner_1();
        owner.setName("Олег");
        cat1.setOwnerName(owner.getName());
        // cat1.Greet();

        System.out.println("Из какого ты города?");//Интерфейс 1
        System.out.print("Кот: ");
        cat1.City();
        System.out.print("Человек: ");    
        owner.City();

        System.out.println();

        System.out.println("Какого ты цвета?");//Интерфейс 2
        System.out.print("Кот: ");
        cat1.Color();
        System.out.print("Человек: ");
        owner.Color();

        System.out.println();

        System.out.println("Где ты родился?"); //Интерфейс 3
        System.out.print("Кот: ");
        cat1.PlaceBorn();
        System.out.print("Человек: ");
        owner.PlaceBorn();

        System.out.println();

        System.out.println("У тебя есть хвост?");//Интерфейс 4
        System.out.print("Кот: ");
        cat1.Tail();
        System.out.print("Человек: ");
        owner.Tail();

        System.out.println();

        System.out.println("Умеешь говорить?");//Интерфейс 5
        System.out.print("Кот: ");
        cat1.AbilityToSpeak();
        System.out.print("Человек: ");
        owner.AbilityToSpeak();

        System.out.println();

        System.out.println("В каком году тебя опросили?");//Интерфейс 1 (год опроса)
        System.out.print("Кот: " + YEAR);
        System.out.println();
        System.out.print("Человек: " + YEAR);

        System.out.println();
        System.out.println();
        
        Cat_1 obj1 = new Cat_1();       //Default-методы
        Owner_1 obj2 = new Owner_1();


        System.out.println("Что делаешь?");
        System.out.print("Кот: " + obj1.sleep());
        System.out.println();
        System.out.print("Человек: " + obj2.sleep());
    }
}
