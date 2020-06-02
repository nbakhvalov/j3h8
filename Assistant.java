package Home8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
@ComponentScan("Home8")
public class Assistant {
    public Clinic getClinic() {

        Reception reception = new Reception();
        IDoctor doctor = new TherapistDoctor();
        //IDoctor doctor = new SurgeonDoctor();
        Clinic clinic = new Clinic();
        clinic.setReception(reception);
        clinic.setDoctor(doctor);
        return clinic;
    }
}
