import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        KnightOfTheRoundTable knight = context.getBean(KnightOfTheRoundTable.class);
        try {
            HolyGrail grail = knight.embarkOnQuest();
            // Manejar el resultado de la búsqueda
        } catch (QuestFailedException e) {
            // Manejar la excepción
        }
    }
}
