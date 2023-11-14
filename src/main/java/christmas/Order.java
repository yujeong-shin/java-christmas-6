package christmas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    public Map<String, Integer> makeOrderList(String OrderListWithComma){
        List<String> orderListWithHyphen = dropComma(OrderListWithComma);
        Map<String, Integer> orderList = splitNameAndCount(orderListWithHyphen);
        return orderList;
    }
    public List<String> dropComma(String OrderListWithComma){
        List<String> orderListWithHyphen = new ArrayList<>();
        String[] orders = OrderListWithComma.split(",");
        for(int i=0; i<orders.length; i++){
            orderListWithHyphen.add(orders[i]);
        }
        return orderListWithHyphen;
    }
    public Map<String, Integer> splitNameAndCount(List<String> orderListWithHyphen){
        Map<String, Integer> orderList = new HashMap<>();
        for(String orderWithHyphen : orderListWithHyphen){
            String[] order = orderWithHyphen.split("-");
            orderList.put(order[0], Integer.parseInt(order[1]));
        }
        return orderList;
    }
}