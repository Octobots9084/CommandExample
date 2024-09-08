package frc.robot;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeTrack extends SubsystemBase {

    private final CANSparkMax trackMotor;

    private static IntakeTrack INSTANCE;

    public IntakeTrack getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new IntakeTrack(0);
        }
        return INSTANCE;
    }

    // Constructor to initialize the motor controller
    public IntakeTrack(int motorID) {
    }

    // Method to set voltage to the motor
    public void setVoltage(double voltage) {

    }

    // Method to get the sensor's value
    public boolean getSensor() {
        return false;
    }

}
