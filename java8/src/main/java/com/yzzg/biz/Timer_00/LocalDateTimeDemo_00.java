package com.yzzg.biz.Timer_00;

import java.time.LocalDateTime;

public class LocalDateTimeDemo_00 {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.now();
        LocalDateTime ld3 = ld.plusYears(2);
        System.out.println(ld3);
    }
}
