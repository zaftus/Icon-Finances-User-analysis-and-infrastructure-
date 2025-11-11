package services;

import models.Infrastructure;
import utils.DataGenerator;
import java.util.ArrayList;
import java.util.List;

public class InfrastructureService {
    private List<Infrastructure> infrastructures;

    public InfrastructureService() {
        infrastructures = new ArrayList<>();
    }

    public void generateSampleInfrastructure() {
        infrastructures.addAll(DataGenerator.generateInfrastructure());
    }

    public List<Infrastructure> getInfrastructures() {
        return infrastructures;
    }
}
