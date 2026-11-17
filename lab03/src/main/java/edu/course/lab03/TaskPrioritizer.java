package edu.course.lab03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskPrioritizer {
    private final PriorityPolicy policy;

    public TaskPrioritizer(PriorityPolicy policy) {
        this.policy = policy;
    }

    public List<ProjectTask> prioritize(List<ProjectTask> tasks) {
        List<ProjectTask> sorted = new ArrayList<>(tasks);
        sorted.sort(Comparator.comparingInt(policy::calculatePriority).reversed());
        return sorted;
    }
}