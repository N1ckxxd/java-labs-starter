package edu.course.lab03;

public class ProjectTask {
    private final String id;
    private final String title;
    private String status;
    private int estimatedHours;

    public ProjectTask(String id, String title, int estimatedHours) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID не может быть пустым");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Название не может быть пустым");
        }
        if (estimatedHours < 0) {
            throw new IllegalArgumentException("Трудоемкость не может быть отрицательной");
        }
        this.id = id;
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.status = "NEW";
    }

    public void changeStatus(String newStatus) {
        if (newStatus == null || newStatus.isBlank()) {
            throw new IllegalArgumentException("Статус не может быть пустым");
        }
        this.status = newStatus;
    }

    public boolean isCompleted() {
        return "DONE".equals(status) || "COMPLETED".equals(status);
    }

    public void increaseEstimatedHours(int hours) {
        if (hours <= 0) {
            throw new IllegalArgumentException("Добавляемое время должно быть положительным");
        }
        this.estimatedHours += hours;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getStatus() { return status; }
    public int getEstimatedHours() { return estimatedHours; }
}