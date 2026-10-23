class Client {
    int clientId;
    String name;
    String email;

    Client(int clientId, String name, String email) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
    }

    void displayClient() {
        System.out.println("Client ID: " + clientId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}