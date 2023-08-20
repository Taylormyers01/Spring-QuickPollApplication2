package com.example.SpringQuickPollApplication2.Repositories;

import com.example.SpringQuickPollApplication2.Domain.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, Long> {
}
