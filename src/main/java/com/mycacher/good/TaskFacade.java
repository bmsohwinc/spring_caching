package com.mycacher.good;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@Component
public class TaskFacade {
    @Cacheable("tasks")
    public List<TaskDTO> findAll() {
        log.info("Retrieving Tasks...");
        return List.of(
                new TaskDTO(1, "My first task", true),
                new TaskDTO(2, "My second task", false)
        );
    }
}
