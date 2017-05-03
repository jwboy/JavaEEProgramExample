package cn.slg.jw.javaee.ch10spring10;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("persistInteceptor")
public class PersistInteceptor {
     @Pointcut("execution (* cn.slg.jw.javaee.ch10spring10.PersonServiceImpl.*(..))")   
     private void pointCutMethod(){};   
    @Before("pointCutMethod() && args(name)")   
     public void doInit(String name){   
        System.out.println("before advice:"+name + "'data is initiated.");   
     }   
    @AfterReturning(pointcut="pointCutMethod()", returning="result")   
     public void successPersist(String result){   
        System.out.println("after returning advice"+":"+result);   
     }   
    @After("pointCutMethod()")   
     public void doResRelease(){   
         System.out.println("after advice");   
     }   
     @AfterThrowing(pointcut="pointCutMethod()", throwing="e")   
     public void doErrorPersit(Exception e){   
         System.out.println("Exception advice");   
     }   
     @Around("pointCutMethod()")   
     public Object doAroundMethod(ProceedingJoinPoint point)throws Throwable{   
         System.out.println("around advice method start,persit start.");   
         Object obj =point.proceed(); System.out.println("exit around advice method.persit end.");   
         return obj;   
     }  
}

