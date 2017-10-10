package ru.bogdanov.microservicesudemy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MicroservicesUdemyApplication {

    @Autowired
    private TeamRepository teamRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesUdemyApplication.class, args);
    }

    @PostConstruct
    public void init() {
        List<Team> list = new ArrayList<>();

        Team team = new Team();
        team.setLocation("Harlem");
        team.setName("Globetrotters");
        list.add(team);

        team = new Team();
        team.setLocation("Washington");
        team.setName("Generals");
        list.add(team);

        teamRepository.save(list);
    }

}


