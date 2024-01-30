import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Quest<HolyGrail> holyGrailQuest() {
        return new HolyGrailQuest();
    }

    @Bean
    public KnightOfTheRoundTable knight(Quest<HolyGrail> quest) {
        return new KnightOfTheRoundTable("Sir Lancelot", quest);
    }
}
