package com.capgemini.junit.performance_testing_using_timeout;

public class TaskPerformance {
    public String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulating a long-running task
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}
