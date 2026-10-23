class Project {
    int projectId;
    String projectName;
    Client client;
    double budget;

    Project(int projectId, String projectName, Client client, double budget) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.client = client;
        this.budget = budget;
    }

    void displayProject() {
        System.out.println("\nProject ID: " + projectId);
        System.out.println("Project Name: " + projectName);
        System.out.println("Budget: " + budget);
        client.displayClient();
    }
}