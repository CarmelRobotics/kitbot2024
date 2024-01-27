package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class ShooterShoot extends Command {
    private Shooter shooter;
    private double speed;

    public ShooterShoot(double speed) {
        shooter = new Shooter();
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
