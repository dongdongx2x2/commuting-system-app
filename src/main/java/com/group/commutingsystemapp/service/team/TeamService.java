package com.group.commutingsystemapp.service.team;

import com.group.commutingsystemapp.domain.team.Team;
import com.group.commutingsystemapp.domain.team.TeamRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }
}
