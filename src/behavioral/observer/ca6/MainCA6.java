package behavioral.observer.ca6;

public class MainCA6 {
    static void main(String[] args) {
        PlayerData playerData = new PlayerData();
        Dashboard dashboard = new Dashboard();
        playerData.registerObserver(dashboard);
        System.out.println("=>[System] BAT DAU TRO CHOI:");
        playerData.setGameData(300,30,0);
        System.out.println("=>[System] Nhan vat da qua duoc mot ai (Cong diem):");
        playerData.setGrade(100);
    }
}
