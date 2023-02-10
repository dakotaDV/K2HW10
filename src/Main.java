import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Иванов", "+79296352016");
        phoneBook.put("Петров", "+79296356578");
        phoneBook.put("Зайцев", "+79263214578");
        phoneBook.put("Васюкин", "+79296647892");
        phoneBook.put("Рассоха", "+7927412589");
        phoneBook.put("Салодухин", "+79294595231");
        phoneBook.put("Чернетта", "+7927549621");
        phoneBook.put("Заплохов", "+79221365472");
        phoneBook.put("Довидович", "+79269632145");
        phoneBook.put("Мишура", "+79295463219");
        phoneBook.put("Евтихина", "+79296547896");
        phoneBook.put("Ващекина", "+79293214569");
        phoneBook.put("Денисова", "+79298546925");
        phoneBook.put("Мамонов", "+79296352016");
        phoneBook.put("Амеличева", "+79294213652");
        phoneBook.put("Самойлов", "+79261475236");
        phoneBook.put("Ивлеева", "+79299621345");
        phoneBook.put("Гузеева", "+79296352016213456");

        System.out.println (phoneBook.get("Иванов")  +
                phoneBook.get("Петров")+
                phoneBook.get("Зайцев")+
                phoneBook.get("Васюкин")+
                phoneBook.get("Рассоха")+
                phoneBook.get("Салодухин")+
                phoneBook.get("Чернетта")+
                phoneBook.get("Заплохов")+
                phoneBook.get("Довидович")+
                phoneBook.get("Мишура")+
                phoneBook.get("Евтихина")+
                phoneBook.get("Ващекина")+
                phoneBook.get("Денисова")+
                phoneBook.get("Амеличева")+
                phoneBook.get("Самойлов")+
                phoneBook.get("Ивлеева")+
                phoneBook.get("Гузеева"));

    }
}