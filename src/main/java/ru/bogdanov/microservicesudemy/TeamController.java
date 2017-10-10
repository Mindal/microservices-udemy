package ru.bogdanov.microservicesudemy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamController {

    @GetMapping("/teams")
    public List<Team> getTeams() {
        List<Team> teams = new ArrayList<>();
        Team team = new Team();
        team.setId(0L);
        team.setLocation("Harlem");
        team.setName("Globetrotters");
        teams.add(team);

        Team team1 = new Team();
        team1.setId(1L);
        team1.setLocation("Washington");
        team1.setName("Generals");
        teams.add(team1);

        return teams;
    }
}
