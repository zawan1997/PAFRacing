package sg.edu.nus.paf.racing.Models;

public class Race {
    String raceId;
    String raceName;
    Integer lap;
    String raceDate;
    
    public String getRaceId() {
        return raceId;
    }
    public void setRaceId(String raceId) {
        this.raceId = raceId;
    }
    public String getRaceName() {
        return raceName;
    }
    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }
    public Integer getLap() {
        return lap;
    }
    public void setLap(Integer lap) {
        this.lap = lap;
    }
    public String getRaceDate() {
        return raceDate;
    }
    public void setRaceDate(String raceDate) {
        this.raceDate = raceDate;
    }

}
