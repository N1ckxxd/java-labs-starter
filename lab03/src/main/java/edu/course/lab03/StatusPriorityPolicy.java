package edu.course.lab03;

public class StatusPriorityPolicy implements PriorityPolicy {
    @Override
    public int calculatePriority(ProjectTask task) {
        return switch (task.getStatus()) {
            case "DONE", "COMPLETED" -> 0;
            case "NEW" -> 10;
            case "IN_PROGRESS" -> 5;
            default -> 1;
        };
    }
}