package sg.edu.nus.paf.racing.Models;

public class Lap {
    String lapId;
    Integer lapTime;
    
    public String getLapId() {
        return lapId;
    }
    public void setLapId(String lapId) {
        this.lapId = lapId;
    }
    public Integer getLapTime() {
        return lapTime;
    }
    public void setLapTime(Integer lapTime) {
        this.lapTime = lapTime;
    }
}
