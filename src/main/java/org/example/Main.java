package org.example;


import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("workintech", Priority.HIGH, Status.IN_PROGRESS, "ann", "workintech");
        Task taskAnn2 = new Task("calculator", Priority.MED, Status.ASSIGNED, "ann", "calculator");

        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);

        Set<Task> bobsTasks = new HashSet<>();
        Task taskBob = new Task("frontend", Priority.HIGH, Status.IN_QUEUE, "bob", "frontend");
        Task taskBob2 = new Task("map", Priority.LOW, Status.IN_PROGRESS, "bob", "map");

        bobsTasks.add(taskBob);
        bobsTasks.add(taskBob2);

        Set<Task> carolsTasks = new HashSet<>();
        Task taskCarol = new Task("backend", Priority.MED, Status.ASSIGNED, "carol", "backend");
        Task taskCarol2 = new Task("habit tracker", Priority.HIGH, Status.IN_PROGRESS, "carol", "habit tracker");

        carolsTasks.add(taskCarol2);
        carolsTasks.add(taskCarol);

        Set<Task> unasignedTasks = new HashSet<>();
        Task unasignedTask = new Task("weather", Priority.HIGH, Status.IN_PROGRESS, "unassigned", "weather");
        unasignedTasks.add(unasignedTask);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, unasignedTasks, carolsTasks);

        System.out.println("bobsTasks: " + taskData.getTasks("bob"));
        System.out.println("annsTasks: " + taskData.getTasks("ann"));
        System.out.println("carolsTasks: " + taskData.getTasks("carol"));
        System.out.println("allTasks: " + taskData.getAllTasks("all"));

        System.out.println("unasigned: "+ taskData.getDifferences(unasignedTasks,taskData.getTasks("ann")));*/


        StringSet.findUniqueWords();
    }
}
