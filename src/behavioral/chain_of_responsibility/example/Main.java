package behavioral.chain_of_responsibility.example;

public class Main {
    static void main(String[] args) {
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        System.out.println("Xin mua chuot may tinh: ");
        teamLead.processRequest(50000);
        System.out.println("Xin mua MayBack: ");
        teamLead.processRequest(1000000);
        System.out.println("Xin mua server:");
        teamLead.processRequest(30000);
        System.out.println("Xin mua lại cong ty:");
        teamLead.processRequest(500000);
    }
}
