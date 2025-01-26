package frc.robot.subsystems.basicTestbed;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkMax;


public class TestbedSubsystem extends SubsystemBase {
  private final SparkMax myMotor;

  public TestbedSubsystem() {
    this.myMotor =
        new SparkMax(3, SparkLowLevel.MotorType.kBrushless);
  }

  public void setSpeed(double speed) {
    myMotor.set(speed);
  }

  public void stop() {
    myMotor.set(0);
  }
}
