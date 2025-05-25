public class Wizard {
    private String name;
    private int level;
    private String specialty;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void levelUp() {
        this.level += 10;
    }

    public String castSpell() {
        return name + " casts a powerful " + specialty + " spell!";
    }

    @Override
    public String toString() {
        return "Wizard(name='" + name + "',level=" + level + ",specialty='" + specialty + "')";
    }
}
