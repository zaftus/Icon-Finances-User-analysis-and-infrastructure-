package reports;

import services.AnalyticsService;
import models.User;
import models.Infrastructure;
import java.io.FileWriter;
import java.io.IOException;

public class CSVReport extends Report {
    @Override
    public void generate(AnalyticsService analyticsService) {
        try (FileWriter writer = new FileWriter("report.csv")) {
            writer.append("User Analysis\n");
            for (User user : analyticsService.getUserService().getUsers()) {
                writer.append(user.getName()).append(",");
                writer.append(user.getDepartment()).append(",");
                writer.append(String.valueOf(user.getPerformanceScore())).append("\n");
            }

            writer.append("\nInfrastructure Analysis\n");
            for (Infrastructure infra : analyticsService.getInfraService().getInfrastructures()) {
                writer.append(infra.getName()).append(",");
                writer.append(infra.getType()).append(",");
                writer.append(String.valueOf(infra.getStatus())).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
