package edu.course.lab03;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskPrioritizerTest {
    @Test
    void testEffortPriority() {
        ProjectTask t1 = new ProjectTask("1", "A", 10);
        ProjectTask t2 = new ProjectTask("2", "B", 5);
        TaskPrioritizer prioritizer = new TaskPrioritizer(new EffortPriorityPolicy());

        List<ProjectTask> result = prioritizer.prioritize(List.of(t1, t2));
        assertEquals("1", result.get(0).getId());
    }

    @Test
    void testStatusPriority() {
        ProjectTask t1 = new ProjectTask("1", "A", 10);
        t1.changeStatus("DONE");
        ProjectTask t2 = new ProjectTask("2", "B", 5);

        TaskPrioritizer prioritizer = new TaskPrioritizer(new StatusPriorityPolicy());
        List<ProjectTask> result = prioritizer.prioritize(List.of(t1, t2));
        assertEquals("2", result.get(0).getId());
    }
}
