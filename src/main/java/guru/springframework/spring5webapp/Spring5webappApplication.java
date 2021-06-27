package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.model.Gender;
import guru.springframework.spring5webapp.model.User;
import guru.springframework.spring5webapp.model.UserProfile;
import guru.springframework.spring5webapp.repository.UserProfileRepository;
import guru.springframework.spring5webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Calendar;

import java.util.Calendar;

@SpringBootApplication
public class Spring5webappApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserProfileRepository userProfileRepository;
	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Clean up database tables
		userProfileRepository.deleteAllInBatch();
		userRepository.deleteAllInBatch();

		//=========================================

		// Create a User instance
		User user = new User("Rajeev", "Singh", "rajeev@callicoder.com",
				"MY_SUPER_SECRET_PASSWORD");

		User user2 = new User("Rajeev", "Singh", "rajeev@callicoder2.com",
				"MY_SUPER_SECRET_PASSWORD2");

		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(1992, 7, 21);

		Calendar dateOfBirth2 = Calendar.getInstance();
		dateOfBirth2.set(2000, 7, 21);

		// Create a UserProfile instance
		UserProfile userProfile = new UserProfile("+91-8197882053", Gender.MALE, dateOfBirth.getTime(),
				"747", "2nd Cross", "Golf View Road, Kodihalli", "Bangalore",
				"Karnataka", "India", "560008");

		UserProfile userProfile2 = new UserProfile("+91-8197882053", Gender.MALE, dateOfBirth.getTime(),
				"747", "2nd Cross", "Golf View Road, Kodihalli", "Bangalore",
				"Karnataka", "India", "560009");

		// Set child reference(userProfile) in parent entity(user)
		user.setUserProfile(userProfile);
		user2.setUserProfile(userProfile2);

		// Set parent reference(user) in child entity(userProfile)
		userProfile.setUser(user);
		userProfile2.setUser(user2);

		// Save Parent Reference (which will save the child as well)
		userRepository.save(user);
		userRepository.save(user2);

		//=========================================
	}
}
