package com.capgemini.junit.performance_testing_using_timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTest {
    @Test
    @Timeout(2) // Test fails if it runs longer than 2 seconds
    void testLongRunningTask() {
        TaskPerformance performance = new TaskPerformance();
        assertEquals("Task Completed", performance.longRunningTask());
    }

}