package guru.springframework.spring5webapp;

import java.time.LocalDate;

public class VideoCassette {

	private Long id;
	private String title;
	private LocalDate productionYear;

	public VideoCassette() {
	}

	public VideoCassette(Long id, String title, LocalDate productionYear) {
		super();
		this.id = id;
		this.title = title;
		this.productionYear = productionYear;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(LocalDate productionYear) {
		this.productionYear = productionYear;
	}

	@Override
	public String toString() {
		return "VideoCassette [id=" + id + ", title=" + title + ", productionYear=" + productionYear + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VideoCassette other = (VideoCassette) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
