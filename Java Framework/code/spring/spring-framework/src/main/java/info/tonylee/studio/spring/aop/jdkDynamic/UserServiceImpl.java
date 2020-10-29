package info.tonylee.studio.spring.aop.jdkDynamic;

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("——————add——————");
    }

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService proxy = (UserService) invocationHandler.getProxy();
        proxy.add();
    }

}
