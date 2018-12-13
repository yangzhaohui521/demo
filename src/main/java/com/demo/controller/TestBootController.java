package com.demo.controller;

import com.demo.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {

    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setName("test");
        return user;
    }


    public static void main(String[] args){

        //java8对map值排序

//        Map<Object, Object> titleMap = new HashMap<>();
//        titleMap.put(1,"1");
//        titleMap.put(2,"1");
//        titleMap.put(3,"1");
//        titleMap.put(4,"1");
//        titleMap.put(5,"1");
//        titleMap.put(6,"1");
//        titleMap.put(7,"1");



//
//        titleMap.entrySet().stream().mapToInt()
//
//
//        Map<Integer, Object> resultMap = new LinkedHashMap<>();

//        Stream<Map.Entry<Integer, Object>> st = titleMap.entrySet().stream();
//        st.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEachOrdered(e -> resultMap.put(e.getKey(), e.getValue()));



//        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
//        cost.stream().map(x-> x+x*0.5).forEach(x-> System.out.println(x));


        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
        double allCost = cost.stream().map(x -> x+x*0.05).reduce((sum,x) -> sum + x).get();



    }



    BinaryOperator<Double> accumulator = (x,y)->x+y;

}