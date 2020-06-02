package Home8;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("TherapistDoctor")
@Scope("prototype")
public class TherapistDoctor implements IDoctor{
    @Override
    public void appointment() {
        System.out.println("Кабинет Терапевта: Пациент пришел к врачу");
    }
}
