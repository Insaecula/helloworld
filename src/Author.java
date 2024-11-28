public class Author {
    private String firstName;
    private String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;
        return firstName.equals(author.firstName) &&
                lastName.equals(author.lastName);
    }
@Override
    public int hashCode() {
        int result = firstName.hashCode();
        result =  result + lastName.hashCode();
        return result;
    }
    @Override
    public String toString() {
 return "Author{" + "firstName" + firstName + '\'' + " lastName=" + lastName + '\'' + '}';


    }

}


