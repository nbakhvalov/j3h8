package Home8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        
        Assistant assistant = new Assistant();
        Clinic clinic = assistant.getClinic();
        clinic.beHealed();
        System.out.println("Пациент получает +20 HP");

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Clinic clinic = context.getBean("clinic", Clinic.class);
//        clinic.beHealed();
    }
}
