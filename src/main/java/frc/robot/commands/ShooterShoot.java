package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class ShooterShoot extends CommandBase {
    private Shooter shooter;
    private double speed;

    public ShooterShoot(double speed, Shooter shootiboi) {
        shooter = shootiboi;
        this.speed = speed;
    }

    @Override
    public void initialize(){}
    @Override
    public void execute(){
        shooter.set(speed);
    }
    @Override
    public void end(boolean interrupted){
        shooter.set(0);   
    }
    @Override
    public boolean isFinished(){return false;}
}
