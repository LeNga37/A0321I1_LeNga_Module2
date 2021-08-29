package furamaResort.utils;

import furamaResort.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate firstDay1 = LocalDate.parse(o1.getFirstDay(), dateTimeFormatter);
        LocalDate firstDay2 = LocalDate.parse(o2.getFirstDay(), dateTimeFormatter);
        LocalDate lastDay1 = LocalDate.parse(o1.getLastDay(), dateTimeFormatter);
        LocalDate lastDay2 = LocalDate.parse(o2.getLastDay(), dateTimeFormatter);

        if (firstDay1.compareTo(firstDay2) > 0) {
            return 1;
        } else if (firstDay1.compareTo(firstDay2) < 0) {
            return -1;
        } else {
            if (lastDay1.compareTo(lastDay2) > 0) {
                return 1;
            } else if (lastDay1.compareTo(lastDay2) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
