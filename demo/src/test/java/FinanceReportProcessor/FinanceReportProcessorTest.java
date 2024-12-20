package FinanceReportProcessor;
import FinanceReport.FinanceReport;
import Payment.Payment;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SuppressWarnings("unused")
public class FinanceReportProcessorTest {
    @Test
    public void fullNameBeginsWithMaxLetter() {
    Payment[] payments = {
            new Payment("Аболдуев Казимир Афанасьеваич", 10, 10, 2023, 10000),
            new Payment("Косоглазов Менингит Графинович", 15, 11, 2023, 20000),
            new Payment("Скверпенсов Роберт Губкович", 20, 12, 2023, 30000),
            new Payment("Звездов Патрик Старович", 25, 1, 2024, 15000)
    };
    Payment[] payment = {
        
    };
    FinanceReport fr = new FinanceReport(payment, "Дурова Манда Ивановна", new Date());
    FinanceReport fr1 = new FinanceReport(payments, "Дурова Манда Ивановна", new Date());
    assertEquals(fr, FinanceReportProcessor.fullNameBeginsWithLetter(fr1, payments, 'П'));
}

    @Test
    public void fullNameBeginsWithMinLetter() {
    Payment[] payments = {
            new Payment("Аболдуев Казимир Афанасьеваич", 10, 10, 2023, 10000),
            new Payment("Косоглазов Менингит Графинович", 15, 11, 2023, 20000),
            new Payment("Скверпенсов Роберт Губкович", 20, 12, 2023, 30000),
            new Payment("Звездов Патрик Старович", 25, 1, 2024, 15000)
    };
    Payment[] payment = {
    };
    FinanceReport fr = new FinanceReport(payment, "Дурова Манда Ивановна", new Date());
    FinanceReport fr1 = new FinanceReport(payments, "Дурова Манда Ивановна", new Date());
    assertEquals(fr, FinanceReportProcessor.fullNameBeginsWithLetter(fr1, payments, 'п'));
    }


    @Test
    public void fullNameBeginsWithLetterException() {
        Payment[] payments = {
                new Payment("Аболдуев Казимир Афанасьеваич", 10, 10, 2023, 10000),
                new Payment("Косоглазов Менингит Графинович", 15, 11, 2023, 20000),
                new Payment("Скверпенсов Роберт Губкович", 20, 12, 2023, 30000),
                new Payment("Звездов Патрик Старович", 25, 1, 2024, 15000)
        };
        Payment[] payment = {
        };
        FinanceReport fr = new FinanceReport(payment, "Дурова Манда Ивановна", new Date());
        FinanceReport fr1 = new FinanceReport(payments, "Дурова Манда Ивановна", new Date());
        assertEquals(fr, FinanceReportProcessor.fullNameBeginsWithLetter(fr1, payments, ' '));
    }


    @Test
    public void smallerPayments() {
        Payment[] payments = {
                new Payment("Аболдуев Казимир Афанасьеваич", 10, 10, 2023, 10000),
                new Payment("Косоглазов Менингит Графинович", 15, 11, 2023, 20000),
                new Payment("Скверпенсов Роберт Губкович", 20, 12, 2023, 30000),
                new Payment("Звездов Патрик Старович", 25, 1, 2024, 15000)
        };

        Date date = new Date();
        FinanceReport fr1 = new FinanceReport(payments, "Дурова Манда Ивановна", date);
        Payment[] expectedPayments = {
                new Payment("Аболдуев Казимир Афанасьеваич", 10, 10, 2023, 10000),
                new Payment("Косоглазов Менингит Графинович", 15, 11, 2023, 20000),
                new Payment("Звездов Патрик Старович", 25, 1, 2024, 15000)
        };
        FinanceReport expected = new FinanceReport(expectedPayments, "Дурова Манда Ивановна", date);
        FinanceReport filtered = FinanceReportProcessor.smallerPayments(fr1, payments, 25000);

        assertEquals(expected, filtered);

    } 
}
