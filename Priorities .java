// Question 10: Java Priority Queue

// Skill Mapping: Basic

// Description: Solve the HackerRank Problem given as a link below -

// https://www.hackerrank.com/challenges/java-priority-queue/problem

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    String name;
    double cgpa;
    int id;

    public Student(String name, double cgpa, int id) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Student other) {
        if (this.cgpa == other.cgpa) {
            if (this.name.compareTo(other.name) == 0) {
                return Integer.compare(this.id, other.id);
            } else {
                return this.name.compareTo(other.name);
            }
        } else if (this.cgpa > other.cgpa) {
            return -1;
        } else {
            return 1;
        }
    }
}

class Priorities {
    public ArrayList<Student> getStudents(List<String> events) {
        int n = events.size();
        PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>();
        for (String event : events) {
            String[] eventData = event.split("\\s");
            if (eventData.length > 1) {
                priorityQueue.add(new Student(eventData[1], Double.valueOf(eventData[2]), Integer.valueOf(eventData[3])));
            } else {
                priorityQueue.poll();
            }
        }
        while (priorityQueue.size() > 1) {
            System.out.println(priorityQueue.poll().name);
        }
        return new ArrayList<Student>(priorityQueue);
    }
}
