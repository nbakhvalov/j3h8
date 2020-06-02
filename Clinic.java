package Home8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("clinic")
@Scope("prototype")
public class Clinic {
    private Reception reception;

    public Reception getReception() {
        return reception;
    }

    @Autowired
    @Qualifier("reception")
    public void setReception(Reception reception) {
        this.reception = reception;
    }


    private IDoctor doctor;

    public IDoctor getDoctor() {
        return doctor;
    }

    @Autowired
    @Qualifier("TherapistDoctor")
    public void setDoctor(IDoctor doctor) {
        this.doctor = doctor;
    }

    public void beHealed() {
        reception.direction();
        doctor.appointment();
        System.out.println("Поликлиннка: Пациент покидает поликлиннку");

    }
}
