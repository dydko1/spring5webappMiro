package guru.springframework.spring5webapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VideoCassetteApi {
	private List<VideoCassette> videoCassettes;

	public VideoCassetteApi() {
		videoCassettes = new ArrayList<VideoCassette>();
		videoCassettes.add(new VideoCassette(1L, "Titanic2", LocalDate.of(1995, 1, 5)));
		videoCassettes.add(new VideoCassette(2L, "Pulp fiction2", LocalDate.of(2001, 2, 5)));
	}

	@GetMapping("/all")
	public List<VideoCassette> getAll() {
		return videoCassettes;
	}

	@GetMapping
	public VideoCassette getById(@RequestParam int index) {
		Optional<VideoCassette> first = videoCassettes.stream().filter(ele -> ele.getId() == index).findFirst();
		return first.get();
	}

	@PostMapping
	public boolean addVideo(@RequestBody VideoCassette videoCassette) {
		return videoCassettes.add(videoCassette);
	}

	@PutMapping
	public boolean updateVideo(@RequestBody VideoCassette videoCassette) {
		return videoCassettes.add(videoCassette);
	}

	@DeleteMapping
	public Boolean deleteVideo(@RequestParam int index) {
		return videoCassettes.removeIf(ele->ele.getId()==index);
	}
}
