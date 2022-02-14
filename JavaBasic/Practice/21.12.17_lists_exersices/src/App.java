import java.util.ArrayList;
import java.util.List;

import address.Address;
import address.Person;

public class App {
    public static void main(String[] args) {
    }

    //1. Есть два класса  : Address  с полями улица и номер дома и Person   с полями
    // name and address.  написать метод  List<Address> getAddresses(List<Person> persons)
    //то есть по списку persons  возвращать список их адресов

    public List<Address> getAddresses(List<Person> persons){
        List<Address> returnAddresses = new ArrayList<>();

        for(Person p: persons) {
            returnAddresses.add(p.getAddress());
        }
        return returnAddresses;
    }

    //2. Есть список с именами: Ivan, Maria, Stephan, John, Amalia.  написать функцию, которая вернет список не
    // содержащий имена исходного списка длиной 4

    public List<String> listWithoutNamesLengthFour(List<String> list){   
        List<String> resList = new ArrayList<>();

        for(String s: list){
            if(s.length() != 4)
                resList.add(s);
        }
        return resList;
    }

    //3. Есть два списка одинаковой длины с числами. Написать метод, возвращающий список с элементами Yes  или No
    // где значение на i-том месте зависит от того, равны ли элементы двух списков под номером i
    //(1,2,3,4) and (5,2,3,3)->(No, Yes, Yes, No)

    public List<String> compareLists (List<Integer> intList1, List<Integer> intList2){
        List<String> resList = new ArrayList<>();

        for (int i = 0; i < intList1.size(); i++) {
               if(intList1.get(i) == intList2.get(i)) {
                    resList.add("Yes");
                } else {
                    resList.add("No");
                }
            }
        }
        return resList;
    }
    // 4. Обьединить два листа в один

    public List<String> combineTwoLists (List<String> list1, List<String> list2) {
        List<String> resList = new ArrayList<>(list1);
        return resList.addAll(list2);
    }

    // 5.есть лист  целых чисел. написать метод, возвращающий лист без элементов больше заданного

    public List<Integer> deleteIntAboveTheNum (List<Integer> intLIst, int num){
        List<Integer> resList = new ArrayList<>();

        for(Integer i: intLIst){
            if(i < num)
                resList.add(i);
        }
        return resList;
    }

    // 6. Есть лист стрингов. Написать метод, возвращающий  самую короткую или самую длинную строку
    // в зависимости от того, какая встречается в листе раньше. Если несколько строк самые короткие или длинные,
    // то учитывается первая встречающаяся

    public String getAShortestOrLongestString(List<String> stringList){
        int minLength = stringList.get(0).length();
        int maxLength = 0;
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < stringList.size(); i++) {
            if(stringList.get(i).length() > maxLength){
                maxLength = stringList.get(i).length();
                indexMax = i;
            }    

            if(stringList.get(i).length() < minLength){
                minLength = stringList.get(i).length();
                indexMin = i;
            }    
        }
        return indexMin < indexMax ? stringList.get(indexMin) : stringList.get(indexMax);
    }
}
