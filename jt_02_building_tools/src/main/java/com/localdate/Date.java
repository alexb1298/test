package com.localdate;

import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;

public class Date {

    public void showDate()
    {
        final ReadablePartial date =new LocalDate();
        System.out.println("**********DATE**********");
        System.out.println("       "+ date.toString());
        System.out.println("**********DATE**********");
    }
}
