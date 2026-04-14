package creational.singleton.logger;

public class Logger {
    private String thoiGian,noiDungLog;
    private static Logger instance;

    private Logger() {
    }
    public static Logger getInstance(){
        if (instance==null){
            instance = new Logger();
        }
        return instance;
    }

    public String getNoiDungLog() {
        return noiDungLog;
    }

    public void setNoiDungLog(String noiDungLog) {
        this.noiDungLog = noiDungLog;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }
}
