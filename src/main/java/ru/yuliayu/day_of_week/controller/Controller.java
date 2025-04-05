package ru.yuliayu.day_of_week.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam(value = "name", defaultValue = "monday") String name){
        name = name.toLowerCase();
        String day = "";
        switch (name){
            case "monday":
                day = "Понедельник";
                break;
            case "tuesday":
                day = "Вторник";
                break;
            case "wednesday":
                day = "Среда";
                break;
            case "thursday":
                day = "Четверг";
                break;
            case "friday":
                day = "Пятница";
                break;
            case "saturday":
                day = "Суббота";
                break;
            case "sunday":
                day = "Воскресенье";
                break;
        }
        return String.format("Сегодня %s!", day);
    }
}
