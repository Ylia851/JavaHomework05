import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args){
        System.out.println(verse("Иван Ивано 
                                  Светлана Петрова
                                  Кристина Белова
                                  Анна Мусина
                                  Анна Крутова
                                  Иван Юрин
                                  Петр Лыков
                                  Павел Чернов
                                  Петр Чернышов
                                  Мария Федорова
                                  Марина Светлова
                                  Мария Савина
                                  Мария Рыкова
                                  Марина Лугова
                                  Анна Владимирова
                                  Иван Мечников 
                                  Петр Петин
                                  Иван Ежов"));
    }

    public static TreeMap<Integer, List<String>> verse (String str){
        TreeMap <Integer, List<String>> stringIntegerTreeMap = new TreeMap<>();
        String[] strArray = str.split(" ");
        for(int i = 0; i < strArray.length; i++){
            int count = 0;
            if(strArray[i].containsKey(count){
                stringIntegerTreeMap.get(count).add(strArray[i]);
                count++;
            }else{
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strArray[i]);
                stringIntegerTreeMap.put(count, temp);
            }
        }
        return stringIntegerTreeMap;

    }

}
