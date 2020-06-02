package Home8;

import org.springframework.stereotype.Component;

@Component("SurgeonDoctor")
public class SurgeonDoctor implements IDoctor{
    @Override
    public void appointment() {
        System.out.println("Кабинет Хирурга: Пациент пришел к врачу");

    }
}
