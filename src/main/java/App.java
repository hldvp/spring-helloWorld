import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld)  applicationContext.getBean("helloworld");

        Cat cat = (Cat) applicationContext.getBean("сatBean");
        Cat twoCat = (Cat) applicationContext.getBean("сatBean");

        System.out.println(bean==bean2);
        System.out.println(cat==twoCat);


    }
}