class Payment {
    int paymentId;
    Project project;
    double amountPaid;
    String status;

    Payment(int paymentId, Project project, double amountPaid) {
        this.paymentId = paymentId;
        this.project = project;
        this.amountPaid = amountPaid;

        if (amountPaid >= project.budget) {
            status = "Paid";
        } else {
            status = "Pending";
        }
    }

    void displayPayment() {
        System.out.println("\nPayment ID: " + paymentId);
        System.out.println("Project: " + project.projectName);
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Status: " + status);
    }
}