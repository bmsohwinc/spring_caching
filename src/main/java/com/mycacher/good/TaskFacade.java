package com.mycacher.good;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@Component
public class TaskFacade {
    @Cacheable(value = "tasks", condition = "!#noCache", key = "'ALL'")
    @CachePut(value = "tasks", condition = "#noCache", key = "'ALL'")
    public List<TaskDTO> findAll(boolean noCache) {
        log.info("Retrieving Tasks...");
        return List.of(
                new TaskDTO(1, "My first task", true),
                new TaskDTO(2, "My second task", false)
        );
    }

    @CacheEvict(value = "tasks", allEntries = true)
    public void clearCache() {
        log.info("Cache has been cleared!!");
    }
}
