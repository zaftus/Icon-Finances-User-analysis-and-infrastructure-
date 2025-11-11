package services;

import models.User;
import models.Infrastructure;
import java.util.List;

public class AnalyticsService {
    private UserService userService;
    private InfrastructureService infraService;

    public AnalyticsService(UserService userService, InfrastructureService infraService) {
        this.userService = userService;
        this.infraService = infraService;
    }

    public void analyzeUsers() {
        List<User> users = userService.getUsers();
        System.out.println("User Analysis:");
        users.forEach(user -> System.out.println(user));
    }

    public void analyzeInfrastructure() {
        List<Infrastructure> infrastructures = infraService.getInfrastructures();
        System.out.println("Infrastructure Analysis:");
        infrastructures.forEach(System.out::println);
    }
}
