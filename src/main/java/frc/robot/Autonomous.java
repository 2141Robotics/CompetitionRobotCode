package frc.robot;
import com.kauailabs.navx.frc.AHRS;
import frc.robot.components.SwerveModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import edu.wpi.first.math.controller.PIDController;

public class Autonomous {
	/** The gryoscope used for rotaiton measurements. */
	private final AHRS gyro;
	/** A list of all of the swerve modules on the drivetrain. */
	private final List<SwerveModule> modules;
	/** The minimum movement speed of the drivetrain. */
	private final double minMove;
	/** The maximum movement speed of the drivetrain. */
	private final double maxMove;
	/** The maximum rotational speed of the robot. */
	private final double maxRot;
	public Autonomous(double minSpeed, double maxSpeed, double maxRotation, AHRS gyroscope, SwerveModule... swerveModules)
	{
		this.minMove = minSpeed;
		this.maxMove = maxSpeed;
		this.maxRot = maxRotation;
		this.gyro = gyroscope;
		this.modules = Collections.unmodifiableList(Arrays.asList(swerveModules));
	}

}
