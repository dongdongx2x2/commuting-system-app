package com.group.commutingsystemapp.service.team;

import com.group.commutingsystemapp.domain.team.Team;
import com.group.commutingsystemapp.domain.team.TeamRepository;
import com.group.commutingsystemapp.dto.TeamDTO;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    public List<TeamDTO> getAllTeams() {
        return teamRepository.findAll().stream()
                .map(team -> new TeamDTO(
                        team.getName(),
                        team.getManager() != null ? team.getManager().getName() : null,
                        team.getMembers().size()
                ))
                .collect(Collectors.toList());
    }
}
