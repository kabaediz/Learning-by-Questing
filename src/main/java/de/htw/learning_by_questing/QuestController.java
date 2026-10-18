package de.htw.learning_by_questing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestController {
    @GetMapping("/quests")
    public List<QuestEntity> index() {
        return List.of(
                new QuestEntity("Thema 1: Web-Basics wiederholen", "Webtechnologien", "DONE", 50, "Ediz"),
                new QuestEntity("Thema 4: Vue-Grundlagen lernen", "Webtechnologien", "IN_PROGRESS", 100, "Malik"),
                new QuestEntity("Thema 7: Datenbankanbindung verstehen", "Webtechnologien", "TODO", 80, "Ediz"),
                new QuestEntity("Thema 9: Betriebskosten Abrechnung", "Controlling", "IN_PROGRESS", 35, "Malik")
        );
    }
}
