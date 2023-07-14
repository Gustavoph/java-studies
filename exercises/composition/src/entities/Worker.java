package entities;
import enums.WorkLevel;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Worker {
  private String name;
  private WorkLevel workLevel;
  private Double baseSalary;
  private Departament departament;
  private List<HourContract> contracts = new ArrayList<>();

  public Worker(String name, WorkLevel workLevel, Double baseSalary, Departament departament) {
    this.name = name;
    this.workLevel = workLevel;
    this.baseSalary = baseSalary;
    this.departament = departament;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkLevel getWorkLevel() {
    return workLevel;
  }

  public void setWorkLevel(WorkLevel workLevel) {
    this.workLevel = workLevel;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public Departament getDepartament() {
    return departament;
  }

  public void setDepartament(Departament departament) {
    this.departament = departament;
  }

  public List<HourContract> getContracts() {
    return contracts;
  }

  public void addContract(HourContract contract) {
    this.contracts.add(contract);
  }

  public void removeContract(HourContract contract) {
    this.contracts.remove(contract);
  }

  public double income(int year, int month) {
    double sum = this.baseSalary;

    for (HourContract contract: this.contracts) {
      int currentMonth = contract.getDate().getMonthValue();
      int currentYear = contract.getDate().getYear();

      if (currentYear == year && currentMonth == month) {
        sum += contract.totalValue();
      }
    }

    return sum;
  }
}
