package eCollegeJavaOCA.StudyGuide_Finegan_Liguori;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Chapter10 {

	public static void main(String[] args) {
		// Q.1
		Period p = Period.parse("P1Y");
		System.out.println(p);
		System.out.println(p.getMonths());
		System.out.println(p.getYears());

		// Q.2
		// At what line is an UnsupportedTemporalException?

		//@formatter:off
		//System.out.println(LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));  //20210303
		//System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE)); //2021-03-03
		//System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE)); //2021-03-03
		//System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); //2021-03-03T16:58:34.617
		//System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
		//@formatter:on


		// Q.4
		// What will be the result?

		String date1 = "2011-12-03";
		// DateTimeFormatter fomatter1 = DateTimeFormatter.ofPattern("yyy-MM-dd");
		// LocalDate localDate1 = LocalDate.parse(date1, formatter1);
		// System.out.println(localDate1.toString() + " ");
		String date2 = "2011-12-03 00:00:00";
		// DateTimeFormatter formatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		// LocalDateTime localDate2 = LocalDateTime.parse(date2, formatter2);
		// System.out.println(localDate2.toString());


		// Q.5
		LocalDateTime ldt;
		ldt = LocalDateTime.of(2001, Month.JANUARY, 1, 1, 1);
		Period period = Period.parse("P1Y1M1D");
		ldt = ldt.plus(period);
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		System.out.println("Q. 5: " + ldt.format(formatter));

		// Q.6
		LocalDateTime currentTime = LocalDateTime.now();
		LocalTime meetingTime = LocalTime.of(16, 10);
		if (meetingTime.isBefore(currentTime.toLocalTime())) {
			System.out.println("You're late!");
		} else {
			System.out.println("There is a meeting later today");
		}


		// code segment 1
		{
			// p = Period.between(currentTime.toLocalTime(), meetingTime);
			// System.out.println("in less than " + ++p.getHours() + ((a == 1) ? " hour." :
			// " hours"));
		}

		// code segment 2
		{
			long a = ChronoUnit.HOURS.between(currentTime.toLocalTime(), meetingTime);
			System.out.println("in less than " + ++a + ((a == 1) ? " hour." : " hours"));
		}
	}

}
