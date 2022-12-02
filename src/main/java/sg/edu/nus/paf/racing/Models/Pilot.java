package sg.edu.nus.paf.racing.Models;

public class Pilot {
    String pilotId;
    String pilotName;
    String droneName;
    
    public String getPilotId() {
        return pilotId;
    }
    public void setPilotId(String pilotId) {
        this.pilotId = pilotId;
    }
    public String getPilotName() {
        return pilotName;
    }
    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }
    public String getDroneName() {
        return droneName;
    }
    public void setDroneName(String droneName) {
        this.droneName = droneName;
    }
}
