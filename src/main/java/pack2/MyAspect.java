package pack2;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component @Aspect
public class MyAspect {
	@Around("execution (public void startProcess())")
	public Object mbc(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("AOP 적용하기 : ID검증 작업 필요");
		
		System.out.print("input ID : ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		
		if(!id.equals("aaa")) {
			System.out.println("ID 불일치! 작업을 여기서 종료합니다.");
			return null;
		} 
		
		Object object = joinPoint.proceed();
		System.out.println("AOP 마무리");
		
		return object;
	}
}	