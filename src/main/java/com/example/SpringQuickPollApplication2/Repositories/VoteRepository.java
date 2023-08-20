package com.example.SpringQuickPollApplication2.Repositories;

import com.example.SpringQuickPollApplication2.Domain.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {
}
