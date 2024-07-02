import java.util.*;

public class MainPhone {
    private Map<String, List<String>> справочник = new HashMap<>();

    // Метод для добавления записи в справочник
    public void add(String фамилия, String номерТелефона) {
        справочник.computeIfAbsent(фамилия, k -> new ArrayList<>()).add(номерТелефона);
    }

    // Метод для поиска всех телефонных номеров по фамилии
    public List<String> get(String фамилия) {
        return справочник.getOrDefault(фамилия, Collections.emptyList());
    }

    // Демонстрация работы справочника
    public static void main(String[] args) {
        MainPhone справочник = new MainPhone();
        справочник.add("Ivanov", "111-222-3344");
        справочник.add("Petrov", "555-666-7788");
        справочник.add("Ivanov", "999-000-1122");

        System.out.println("Number Ivanov: " + справочник.get("Ivanov"));
        System.out.println("Number Petrov: " + справочник.get("Petrov"));
    }
}