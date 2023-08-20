package com.example.SpringQuickPollApplication2.Repositories;

import com.example.SpringQuickPollApplication2.Domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {
}
