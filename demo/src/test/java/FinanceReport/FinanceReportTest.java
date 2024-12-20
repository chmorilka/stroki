package FinanceReport;
import Payment.Payment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class FinanceReportTest {
    @Test
    public void getIndexOfPayment() {
        Payment[] payments = {
                new Payment("Аболдуев Казимир Афанасьеваич", 10, 10, 2023, 10000),
                new Payment("Косоглазов Менингит Графинович", 15, 11, 2023, 20000),
                new Payment("Скверпенсов Роберт Губкович", 20, 12, 2023, 30000),
                new Payment("Звездов Патрик Старович", 25, 1, 2024, 15000)
        };
        FinanceReport fr = new FinanceReport(payments, "Test Author", new Date());
        Payment payment = new Payment("Скверпенсов Роберт Губкович", 20, 12, 2023, 30000);
        assertEquals(payment, fr.getIndexOfPayment(2));
    }

    @Test
    public void getIndexOfPaymentException() {
        Payment[] payments = {
                new Payment("Аболдуев Казимир Афанасьеваич", 10, 10, 2023, 10000),
                new Payment("Косоглазов Менингит Графинович", 15, 11, 2023, 20000),
                new Payment("Скверпенсов Роберт Губкович", 20, 12, 2023, 30000),
                new Payment("Звездов Патрик Старович", 25, 1, 2024, 15000)
        };
        FinanceReport fr = new FinanceReport(payments, "Test Author", new Date());
        assertThrows(IndexOutOfBoundsException.class, () -> {
            fr.getIndexOfPayment(-2);
        });
    }

    @Test
    public void getIndexOfPaymentExceptionMoreLenght() {
        Payment[] payments = {
                new Payment("Аболдуев Казимир Афанасьеваич", 10, 10, 2023, 10000),
                new Payment("Косоглазов Менингит Графинович", 15, 11, 2023, 20000),
                new Payment("Скверпенсов Роберт Губкович", 20, 12, 2023, 30000),
                new Payment("Звездов Патрик Старович", 25, 1, 2024, 15000)
        };
        FinanceReport fr = new FinanceReport(payments, "Аболдуев Казимир Афанасьеваич", new Date());
        assertThrows(IndexOutOfBoundsException.class, () -> {
            fr.getIndexOfPayment(5);
        });
    }

    @Test
    public void setIndexOfPayments() {
        Payment[] payments = {new Payment("Аболдуев Казимир Афанасьеваич", 1, 1, 2024, 1000)};
        Payment newPayment = new Payment("Дурова Манда Ивановна", 20, 3, 2024, 75000);
        FinanceReport fr = new FinanceReport(payments, "Test Author", new Date());
        fr.setIndexOfPayment(0, newPayment);
        assertEquals(newPayment, fr.getIndexOfPayment(0));
    }

    @Test
    public void setIndexOfPaymentsException() {
        Payment[] payments = {new Payment("Аболдуев Казимир Афанасьеваич", 1, 1, 2024, 1000)};
        Payment newPayment = new Payment("Дурова Манда Ивановна", 20, 3, 2024, 75000);
        FinanceReport fr = new FinanceReport(payments, "Test Author", new Date());
        assertThrows(IndexOutOfBoundsException.class, () -> {
            fr.setIndexOfPayment(-1, newPayment);
        });
    }

    @Test
    public void setIndexOfPaymentsExceptionMoreLenght() {
        Payment[] payments = {new Payment("Аболдуев Казимир Афанасьеваич", 1, 1, 2024, 1000)};
        Payment newPayment = new Payment("Дурова Манда Ивановна", 20, 3, 2024, 75000);
        FinanceReport fr = new FinanceReport(payments, "Test Author", new Date());
        assertThrows(IndexOutOfBoundsException.class, () -> {
            fr.setIndexOfPayment(3, newPayment);
        });
    }
}