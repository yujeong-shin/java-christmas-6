package christmas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    Order order = new Order();

    public Map<String, Integer> getAppetizer(){
        String appetizerWithComma ="양송이수프(6,000),타파스(5,500),시저샐러드(8,000)";
        Map<String, Integer> appetizer = new HashMap<>();
        List<String> appetizerList = order.dropComma(appetizerWithComma);
        for(String appetizerWithSign : appetizerList) {
            String nameAndPrice = removeSign(appetizerWithSign);
            String menuName = splitName(nameAndPrice);
            int menuPrice = splitPrice(nameAndPrice);
            appetizer.put(menuName, menuPrice);
        }
        return appetizer;
    }

    public Map<String, Integer> getMain(){
        String mainWithComma ="티본스테이크(55,000),바비큐립(54,000),해산물파스타(35,000),크리스마스파스타(25,000)";
        Map<String, Integer> main = new HashMap<>();
        List<String> mainList = order.dropComma(mainWithComma);
        for(String mainWithSign : mainList) {
            String nameAndPrice = removeSign(mainWithSign);
            String menuName = splitName(nameAndPrice);
            int menuPrice = splitPrice(nameAndPrice);
            main.put(menuName, menuPrice);
        }
        return main;
    }

    public Map<String, Integer> getDessert(){
        String dessertWithComma = "초코케이크(15,000),아이스크림(5,000)";
        Map<String, Integer> dessert = new HashMap<>();
        List<String> dessertList = order.dropComma(dessertWithComma);
        for(String dessertWithSign : dessertList) {
            String nameAndPrice = removeSign(dessertWithSign);
            String menuName = splitName(nameAndPrice);
            int menuPrice = splitPrice(nameAndPrice);
            dessert.put(menuName, menuPrice);
        }
        return dessert;
    }

    public Map<String, Integer> getDrink(){
        String drinkWithComma = "제로콜라(3,000),레드와인(60,000),샴페인(25,000)";
        Map<String, Integer> drink = new HashMap<>();
        List<String> drinkList = order.dropComma(drinkWithComma);
        for(String drinkWithSign : drinkList) {
            String nameAndPrice = removeSign(drinkWithSign);
            String menuName = splitName(nameAndPrice);
            int menuPrice = splitPrice(nameAndPrice);
            drink.put(menuName, menuPrice);
        }
        return drink;
    }

    public String splitName(String nameAndPrice){
        return nameAndPrice.replaceAll("[0-9]", "");

    }
    public int splitPrice(String nameAndPrice){
        return Integer.parseInt(nameAndPrice.replaceAll("[^0-9]", ""));
    }
    public String removeSign(String appetizerWithSign){
        return appetizerWithSign.replaceAll("[()]", "");
    }
}