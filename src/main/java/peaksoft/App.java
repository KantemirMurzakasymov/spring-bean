package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat one = (Cat) applicationContext.getBean("cat");
        one.setId(1);
        one.setName("Pulla");
        one.setAge((short) 3);
        System.out.println("ID : " + one.getId() + "\n Name : " + one.getName() + "\n Age : " + one.getAge());

        Cat two = (Cat) applicationContext.getBean("cat");
        two.setId(2);
        two.setName("Mauguli");
        two.setAge((short) 4);
        System.out.println("ID : " + two.getId() + "\n Name : " + two.getName() + "\n Age : " + two.getAge());

        System.out.println(bean == bean2 );

        System.out.println(one == two );

    }
}
