package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class ShooterShoot extends Command {
    // Varyables 
    private Shooter shooter;
    private double speed;

    public ShooterShoot(double speed, Shooter shootyboi) {
        // Shooter Object
        shooter = shootyboi;
        // How fast to go
        this.speed = speed;
    }

    @Override
    public void initialize(){}

    @Override
    public void execute(){
        // motor go bur
        shooter.set(speed);
    }
    @Override
    public void end(boolean interrupted){
        // motor stop :(
        shooter.set(0);   
    }
    @Override
    public boolean isFinished(){return false;}
}
