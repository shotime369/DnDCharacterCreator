public class character {
    String cls;
    String race;
    int strength;
    int charisma;
    int dexterity;

    // Constructor to initialize the person's information
    public void Person(String race, String cls, int strength, int charisma, int dexterity) {

        this.cls = cls;
        this.race = race;
    }
    public String getCls() {
        return cls;
    }
    public void setCls(String cls) {
        this.cls = cls;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }


    //public String getName() {
     //   return name;
    //}
    //public void setName(String name) {
     //   this.name = name;
    //}
    //public int getAge() {
    //    return age;
    //}
   // public void setAge(int age) {
     //   this.age = age;
    //}
}

