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
		videoCassettes = new ArrayList<>();
		videoCassettes.add(new VideoCassette(1L, "Titanic1", LocalDate.of(1995, 01, 02)));
		videoCassettes.add(new VideoCassette(2L, "Titanic2", LocalDate.of(1996, 01, 02)));
	}

	@GetMapping("/all")
	public List<VideoCassette> getAll() {
		return videoCassettes;
	}

	@GetMapping
	public VideoCassette getById(@RequestParam Long index) {
		Optional<VideoCassette> first = videoCassettes.stream().filter(element -> element.getId() == index).findFirst();
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
	public boolean deleteVideo(@RequestParam Long index) {
		return videoCassettes.removeIf(element -> element.getId() == index);
	}
}
