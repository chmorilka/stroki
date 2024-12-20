package FinanceReportProcessor;
import Payment.*;
import FinanceReport.*;
import java.util.ArrayList;
import java.util.List;

public class FinanceReportProcessor {
    public static FinanceReport fullNameBeginsWithLetter( FinanceReport fr, Payment[] payments, char letter) {
        List<Payment> payment = new ArrayList<>();
        for (Payment p : payments) {
            if (p.getFullname().trim().toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
                     payment.add(p);
                  }
             }
             return new FinanceReport(payment.toArray(new Payment[0]), fr.getFullNameAftor(), fr.getReportDate());
 }
               
        public static FinanceReport smallerPayments( FinanceReport fr, Payment[] payments, int value) {
        List<Payment> payment = new ArrayList<>();
        for (Payment p : payments) {
            if (p.getSum() < value) {
                payment.add(p);
            }
        }
        return new FinanceReport(payment.toArray(new Payment[0]), fr.getFullNameAftor(), fr.getReportDate());
    }
}