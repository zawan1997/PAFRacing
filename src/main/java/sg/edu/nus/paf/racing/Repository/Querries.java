package sg.edu.nus.paf.racing.Repository;

public class Querries {
    public static String SQL_INSERT_PILOT = "insert into pilot_details(pilot_id, pilot_name, drone_name) values (?, ?, ?)";
    public static String SQL_INSERT_RACE = "insert into race_details(race_id, race_name, no_lap, race_date) values (?, ?, ?, ?)";
    public static String SQL_INSERT_LAP = "insert into lap_details(lap_id, lap_time) values (?, ?, ?)";
}
