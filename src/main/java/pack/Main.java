package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		
		LogicInter logicInter = (LogicInter)context.getBean("logicImpl");
		logicInter.startProcess();
	}
}