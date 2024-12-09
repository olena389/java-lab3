public class Main {

    // Поля класу (мінімум 5 полів)
    private String name; // Назва човна
    private double length; // Довжина човна
    private double weight; // Вага човна
    private int year; // Рік виробництва
    private boolean isMotorized; // Чи має мотор

    // Конструктор класу для ініціалізації полів
    public Main(String name, double length, double weight, int year, boolean isMotorized) {
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.year = year;
        this.isMotorized = isMotorized;
    }

    // Геттери та сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isMotorized() {
        return isMotorized;
    }

    public void setMotorized(boolean motorized) {
        isMotorized = motorized;
    }

    // Метод для виведення інформації про човен
    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", weight=" + weight +
                ", year=" + year +
                ", isMotorized=" + isMotorized +
                '}';
    }

    public static void main(String[] args) {

        // Створення масиву об'єктів класу Main (човни)
        Main[] boats = new Main[] {
                new Main("Boat1", 5.5, 1200, 2015, true),
                new Main("Boat2", 6.0, 1500, 2018, false),
                new Main("Boat3", 4.5, 1100, 2017, true),
                new Main("Boat4", 7.0, 2000, 2020, true),
                new Main("Boat5", 6.2, 1600, 2016, false)
        };

        // Виведення масиву човнів
        System.out.println("List of Boats:");
        for (Main boat : boats) {
            System.out.println(boat);
        }
    }
}
