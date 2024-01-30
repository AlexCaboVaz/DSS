import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KnightOfTheRoundTable {
    private String name;
    private final Quest<HolyGrail> quest;

    @Autowired
    public KnightOfTheRoundTable(String name, Quest<HolyGrail> quest) {
        this.name = name;
        this.quest = quest;
    }

    public HolyGrail embarkOnQuest() throws QuestFailedException {
        return quest.embark();
    }
}
