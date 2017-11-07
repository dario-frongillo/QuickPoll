package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.domain.Option;

public interface OptionRepository extends CrudRepository<Option, Long> {
}
