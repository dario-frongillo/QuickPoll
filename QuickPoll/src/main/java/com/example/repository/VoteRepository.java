package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.domain.Vote;

public interface VoteRepository extends CrudRepository<Vote, Long> {
}
