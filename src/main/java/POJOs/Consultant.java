package POJOs;

public class Consultant {

    int id;
    String name;
    String surname;
    String equipment;
    String position;
    String[] availabilityRegions;

    public Consultant(int id, String name, String surname, String equipment, String position, String[] availabilityRegions) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.equipment = equipment;
        this.position = position;
        this.availabilityRegions = availabilityRegions;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getPosition() {
        return position;
    }

    public String[] getAvailabilityRegions() {
        return availabilityRegions;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAvailabilityRegions(String availabilityRegions[]) {
        this.availabilityRegions = availabilityRegions;
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", equipment='" + equipment + '\'' +
                ", position='" + position + '\'' +
                ", availabilityRegions='" + availabilityRegions + '\'' +
                '}';
    }
}
