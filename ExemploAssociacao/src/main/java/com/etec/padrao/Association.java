package com.etec.padrao;

// Java program to illustrate the
// concept of Association
// class bank
class Bank
{

  private final String name;

  // bank name
  Bank(String name)
  {
    this.name = name;
  }

  public String getBankName()
  {
    return this.name;
  }
}

// employee class
class Employee
{

  private final String name;

  // employee name
  Employee(String name)
  {
    this.name = name;
  }

  public String getEmployeeName()
  {
    return this.name;
  }
}

// Association between both the
// classes in main method
class Association
{

  public static void main(String[] args)
  {
    Bank bank = new Bank("Bank Boston");
    Employee emp = new Employee("John");

    System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
  }
}
