public class Main {
    public static void main(String[] args) {
    var hoursWork = 640;
    var personHours = 8;
    var allWorkers = hoursWork / personHours;
    System.out.println("Всего рабоников компании - " + allWorkers + " человек.");
    allWorkers = allWorkers + 94;
    var allHours = hoursWork / allWorkers;
    System.out.println("Если в компании работает " + allWorkers + " человек, то всего " + allHours + " часа работы может быть поделено между сотрудниками.");
    }
}