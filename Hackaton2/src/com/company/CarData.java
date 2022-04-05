package com.company;

import java.util.Date;

public class CarData {
    private Model model = new Model();

    private enum EngineCondition {
        Disabled,
        Idling,
        Normal,
        Critical

        // Forced = Normal or Critical
        // Enabled = !Disabled
    }

    private String carID;
    private Date date;

    public CarData(String carID, Date date, int mileage, Time timeInMotion, Time timeEngineWorking, Time timeEngineWorkingInMotion, Time timeEngineIdled, Time timeEngineNormal, Time timeEngineCritical, int startVolume, int endVolume) {
        this.carID = carID;
        this.date = date;
        this.mileage = mileage;
        this.timeInMotion = timeInMotion;
        this.timeEngineWorking = timeEngineWorking;
        this.timeEngineWorkingInMotion = timeEngineWorkingInMotion;
        this.timeEngineIdled = timeEngineIdled;
        this.timeEngineNormal = timeEngineNormal;
        this.timeEngineCritical = timeEngineCritical;
        this.startVolume = startVolume;
        this.endVolume = endVolume;
    }

    private int mileage;
    private Time timeInMotion;
    private Time timeEngineWorking; //(1)
    private Time timeEngineWorkingInMotion; //(2)
    //timeEngineWorkingWithoutMotion = (1)-(2);
    private Time timeEngineIdled;
    private Time timeEngineNormal; //(3)
    private Time timeEngineCritical; //(4)
    //timeEngineForced = (3)+(4);
    private int startVolume;
    private int endVolume;
    //private EngineCondition engineCondition;

}
