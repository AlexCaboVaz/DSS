import org.springframework.stereotype.Service;

@Service
public class HolyGrailQuest implements Quest<HolyGrail> {
    public HolyGrailQuest() { /* Constructor */ }

    @Override
    public HolyGrail embark() throws QuestFailedException {
        // Lógica de la misión
        return new HolyGrail();
    }
}
