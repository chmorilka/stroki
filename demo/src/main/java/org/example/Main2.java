package org.example;
import FinanceReport.FinanceReport;
import java.util.Date;

import static FinanceReportProcessor.FinanceReportProcessor.fullNameBeginsWithLetter;
import static FinanceReportProcessor.FinanceReportProcessor.smallerPayments;

import Payment.Payment;

public class Main2 {
public static void main(String[] args) {
        Payment[] payments = {
                new Payment("Аболдуев Казимир Афанасьеваич", 10, 10, 2023, 10000),
                new Payment("Косоглазов Менингит Графинович", 15, 11, 2023, 20000),
                new Payment("Скверпенсов Роберт Губкович", 20, 12, 2023, 30000),
                new Payment("Звездов Патрик Старович", 25, 1, 2024, 15000)
        };
        Date reportDate = new Date();
        FinanceReport report = new FinanceReport(payments, "Дурова Манда Ивановна", reportDate);

        System.out.println("Количество платежей: " + report.getAmountOfPayments());

        FinanceReport fullNameBeginsWithLetter = fullNameBeginsWithLetter(report, payments, 'И');
        System.out.println("\nПервая буква Фамилии 'И':\n" + fullNameBeginsWithLetter);

        FinanceReport smallerPayments = smallerPayments(report, payments, 15000);
        System.out.println("\nПлатежи, у которых сумма меньше 15000:\n" + smallerPayments);

    Payment newPayments = new Payment("Шоколадов Сникерс Диабетович", 20, 3, 2024, 76000);
    report.setIndexOfPayment(0, newPayments);
    System.out.println("Платеж " + report. getIndexOfPayment(0));

    }
}