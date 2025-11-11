package utils;

import models.User;
import models.Infrastructure;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {
    private static String[] departments = {"Finance", "HR", "IT", "Operations"};

    public static User generateRandomUser() {
        Random rand = new Random();
        String name = "User" + rand.nextInt(1000);
        String dept = departments[rand.nextInt(departments.length)];
        int score = rand.nextInt(100);
        return new User(name, dept, score);
    }

    public static List<Infrastructure> generateInfrastructure() {
        List<Infrastructure> list = new ArrayList<>();
        list.add(new Infrastructure("Server1", "Database", "Operational"));
        list.add(new Infrastructure("Server2", "Web", "Operational"));
        list.add(new Infrastructure("Workstation1", "PC", "Maintenance"));
        return list;
    }
}
