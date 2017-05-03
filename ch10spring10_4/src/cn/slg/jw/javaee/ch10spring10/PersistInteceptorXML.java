package cn.slg.jw.javaee.ch10spring10;


import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("persistInteceptorXML")
public class PersistInteceptorXML {

	public void doInit(String name) {
		System.out.println("before advice:" + name + "'data is initiated.");
	}

	public void successPersist(String result) {
		System.out.println("after returning advice" + ":" + result);
	}

	public void doResRelease() {
		System.out.println("after advice");
	}

	public void doErrorPersit(Exception e) {
		System.out.println("Exception advice");
	}

	public Object doAroundMethod(ProceedingJoinPoint point) throws Throwable {
		System.out.println("around advice method start,persit start.");
		Object obj = point.proceed();
		System.out.println("exit around advice method.persit end.");
		return obj;
	}
}
