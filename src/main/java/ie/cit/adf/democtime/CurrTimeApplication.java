package ie.cit.adf.democtime;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrTimeApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Current Time Application");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config-context.xml");
		CurrTimeServiceImplement currtimeserviceimp = (CurrTimeServiceImplement) ctx.getBean(CurrTimeService.class);
		Date todaycurrentdate = currtimeserviceimp.getTodyaysDate();
		System.out.println("Todays Date"+todaycurrentdate);

	}

}
