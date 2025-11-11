import services.UserService;
import services.InfrastructureService;
import services.AnalyticsService;
import reports.CSVReport;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        InfrastructureService infraService = new InfrastructureService();
        AnalyticsService analyticsService = new AnalyticsService(userService, infraService);

        // Generate sample users and infrastructure
        userService.generateSampleUsers(10);
        infraService.generateSampleInfrastructure();

        // Run analytics
        analyticsService.analyzeUsers();
        analyticsService.analyzeInfrastructure();

        // Generate report
        CSVReport report = new CSVReport();
        report.generate(analyticsService);
        
        System.out.println("Analysis complete. Report generated.");
    }
}
