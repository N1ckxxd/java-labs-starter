package edu.course.lab02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProjectTaskTest {

    @Test
    void changeStatusAndCompletion() {
        ProjectTask task = new ProjectTask("T-1", "Fix bug", 5);
        assertFalse(task.isCompleted());

        task.changeStatus("DONE");
        assertTrue(task.isCompleted());
        assertEquals("DONE", task.getStatus());
    }

    @Test
    void increaseHours() {
        ProjectTask task = new ProjectTask("T-2", "Feature", 10);
        task.increaseEstimatedHours(5);
        assertEquals(15, task.getEstimatedHours());
    }

    @Test
    void invalidConstructorData() {
        assertThrows(IllegalArgumentException.class, () ->
                new ProjectTask("", "Title", 5)
        );
    }
}