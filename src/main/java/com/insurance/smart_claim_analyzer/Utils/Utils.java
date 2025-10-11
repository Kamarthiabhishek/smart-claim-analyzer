package com.insurance.smart_claim_analyzer.Utils;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

@Data
@Component
public class Utils {
    public static LocalDate dateola = LocalDate.now();
    public static LocalTime timeola = LocalTime.now();
    public static LocalDateTime notifdte = LocalDateTime.now();

    public static int generateNumber(){
        Random random = new Random();
        return 100000+random.nextInt();
    }
}
