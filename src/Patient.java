public class Patient {
    private int id;
    private String name;
    private String surname;
    private String parentName;
    private String address;
    private int number;
    private int medCard;
    private String diagnose;

    // Конструктор
    public Patient(int id, String name, String surname, String parentName, String address, int number, int medCard, String diagnose) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.parentName = parentName;
        this.address = address;
        this.number = number;
        this.medCard = medCard;
        this.diagnose = diagnose;
    }

    // Геттери

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getParentName() {
        return parentName;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public int getMedCard() {
        return medCard;
    }

    public String getDiagnose() {
        return diagnose;
    }

    // Сеттери

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMedCard(int medCard) {
        this.medCard = medCard;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String toString() {
        return "ID: " + id + "; Ім'я: " + name + "; Прізвище: " + surname + ";  По-батькові: " + parentName + "; Адреса: " + address + "; Номер телефону: " + number + "; Номер мед.карти: " + medCard + "; Діагноз: " + diagnose;
    }
}