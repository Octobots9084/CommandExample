package frc.robot;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeRollers extends SubsystemBase {

    private final CANSparkMax rollerMotor;

    private static IntakeRollers INSTANCE;

    public IntakeRollers getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new IntakeRollers(0);
        }
        return INSTANCE;
    }

    // Constructor to initialize the motor controller
    public IntakeRollers(int motorID) {
    }

    // Method to set voltage to the motor
    public void setVoltage(double voltage) {

    }

}
