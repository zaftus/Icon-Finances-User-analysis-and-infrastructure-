package services;

import models.User;
import utils.DataGenerator;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users;

    public UserService() {
        users = new ArrayList<>();
    }

    public void generateSampleUsers(int count) {
        for (int i = 0; i < count; i++) {
            users.add(DataGenerator.generateRandomUser());
        }
    }

    public List<User> getUsers() {
        return users;
    }
}
