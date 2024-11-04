package constructors.library;

public class Author {

   private String name, surname;
   private int birthYear, deathYear;

   public Author(String name, String surname, int birthYear) {
      this.name = name;
      this.surname = surname;
      this.birthYear = birthYear;
   }

   public Author(String name, String surname, int birthYear, int deathYear) {
      this.name = name;
      this.surname = surname;
      this.birthYear = birthYear;
      this.deathYear = deathYear;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSurname() {
      return surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public int getBirthYear() {
      return birthYear;
   }

   public void setBirthYear(int birthYear) {
      this.birthYear = birthYear;
   }

   public int getDeathYear() {
      return deathYear;
   }

   public void setDeathYear(int deathYear) {
      this.deathYear = deathYear;
   }
}
