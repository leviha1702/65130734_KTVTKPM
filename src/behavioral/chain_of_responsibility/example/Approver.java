package behavioral.chain_of_responsibility.example;

public abstract class Approver {
    protected Approver nextApprover;
    public void setNextApprover(Approver nextApprover){
        this.nextApprover = nextApprover;

    }

    public abstract void processRequest(double amount);
}
