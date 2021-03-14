package guru.springframework.spring5webapp;

public class MyClass {
    Long id;
    String description;

    public MyClass() {
        id=1000L;
        description="opis";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
