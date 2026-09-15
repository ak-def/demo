package io.github.akdev.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class TaskRepositoryTest {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    void savesAndRetrievesATask() {
        Task task = new Task();
        task.setTitle("Write unit tests");
        task.setDone(false);

        taskRepository.save(task);

        List<Task> allTasks = taskRepository.findAll();

        assertThat(allTasks).hasSize(1);
        assertThat(allTasks.get(0).getTitle()).isEqualTo("Write unit tests");
    }
}