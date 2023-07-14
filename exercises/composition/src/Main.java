import entities.Departament;
import entities.HourContract;
import entities.Worker;
import enums.WorkLevel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.print("Enter departament's name: ");
    String departamentName = sc.nextLine();

    System.out.println("Enter worker data: ");

    System.out.print("Name: ");
    String workerName = sc.nextLine();

    System.out.print("Level: ");
    String workerLevel = sc.nextLine();

    System.out.print("Base salary: ");
    double baseSalary = sc.nextDouble();
    sc.nextLine();

    Worker worker = new Worker(workerName, WorkLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));

    System.out.print("How many contracts to this worker: ");
    int numberOfContracts = sc.nextInt();

    for (int count = 1; count <= numberOfContracts; count++) {
      System.out.printf("Enter contract #%d data: %n", count);

      System.out.print("Date (DD/MM/YYYY): ");
      LocalDate date = LocalDate.parse(sc.next(), formatter);

      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();

      System.out.print("Duration (hours): ");
      int hours = sc.nextInt();

      HourContract contract = new HourContract(date, valuePerHour, hours);
      worker.addContract(contract);
    }

    System.out.println();
    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    String monthAndYear = sc.next();

    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));

    System.out.println("Name: " + worker.getName());
    System.out.println("Departament: " + worker.getDepartament());
    System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(year, month));
  }
}