package T2B3;

public class Author {
    String name;
    String Email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

    public Author(String name, String email) {
        this.name = name;
        Email = email;
    }
}
