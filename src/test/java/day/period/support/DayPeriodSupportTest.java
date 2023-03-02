package day.period.support;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class DayPeriodSupportTest {

    @Test
    public void methodTest() {
        LocalDate date = LocalDate.of(2023, 3, 1);
        Period period = Period.ofWeeks(3).plusDays(5); // crear un período de 3 semanas y 5 días
        //LocalDate newDate = date.plus(period.to16DayPeriod()); // agregar el período de 16 días a la fecha existente
        System.out.println("Fecha original: " + date);
        System.out.println("Período de tiempo: " + period);
        //System.out.println("Nueva fecha: " + newDate);
    }

}
