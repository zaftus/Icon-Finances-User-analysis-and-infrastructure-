package models;

public class User {
    private String name;
    private String department;
    private int performanceScore;

    public User(String name, String department, int performanceScore) {
        this.name = name;
        this.department = department;
        this.performanceScore = performanceScore;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    @Override
    public String toString() {
        return name + " | " + department + " | Score: " + performanceScore;
    }
}
