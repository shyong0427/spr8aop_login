package pack;

import org.springframework.stereotype.Service;

@Service
public class LogicImpl implements LogicInter {
	public LogicImpl() {
	}
	
	public void startProcess() {
		System.out.println("핵심 로직 수행");
	}
}