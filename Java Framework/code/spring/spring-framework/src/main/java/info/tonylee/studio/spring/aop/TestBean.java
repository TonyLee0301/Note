package info.tonylee.studio.spring.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    private String testStr = "testStr";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public void test(){
        System.out.println("test");
    }

    public void test1(){
        System.out.println("test1");
//        ((TestBean)AopContext.currentProxy()).test();
    }

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("/META-INF/aop/test-aop.xml");
        TestBean testBean = bf.getBean(TestBean.class);
        testBean.test();
        System.out.println("--------------");
        testBean.test1();
    }

}
