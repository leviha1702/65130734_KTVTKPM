package creational.singleton.vote;

public class MainVote {
    static void main() {
        User user1 = new User("Viet Ha");
        User user2 = new User("Viet Hoang");
        User user3 = new User("Viet Kieu");
        user1.vote(Candidate.TRUMP);
        user2.vote(Candidate.BIDEN);
        user3.vote(Candidate.TRUMP);
        user3.vote(Candidate.BIDEN);
        Election.getInstance().printResult();
    }
}
