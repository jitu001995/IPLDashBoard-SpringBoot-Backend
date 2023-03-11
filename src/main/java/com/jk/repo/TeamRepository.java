package com.jk.repo;

import org.springframework.data.repository.CrudRepository;

import com.jk.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
