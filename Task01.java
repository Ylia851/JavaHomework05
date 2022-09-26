import java.util.Map;

public final class Task01 {
    public static Map <Integer, String> phoneNumb = Map.of(12345, 'Иванов',
                                                           42424,'Иванов',
                                                           75391, 'Петрова' )

    public static Map <String, List<Integer>> surnameMap = Map.of('Иванов', List.of(12345, 42424), 'Петров', List.of(75391));
    
    public static void main(String[] args){
        phoneNumbBySurname('Петров');
    }

    public static void phoneNumbBySurname(String surname){
        System.out.println(surnameMap.get(surname));
    }


}