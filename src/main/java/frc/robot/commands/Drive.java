/** 
* 
* @author 3197-Hexhounds 
*/
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class Drive extends CommandBase {
  DriveTrain drivetrain;

  public Drive(DriveTrain drivetrain) {
    this.drivetrain = drivetrain;
    addRequirements(drivetrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double l = RobotContainer.getLeft();
    double r = RobotContainer.getRight();

    drivetrain.tankDrive(-l * .8, -r * .8);
  }

  /**
   * @param interrupted
   */
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  /**
   * @return boolean
   */
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
