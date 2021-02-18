package com.techprimers.model;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
  private static final long serialVersionUID = 5L;

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", id=" + id +
        ", salary='" + salary + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(name, user.name) &&
        Objects.equals(id, user.id) &&
        Objects.equals(salary, user.salary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, salary);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  public User() {
  }

  private String name;
  private Integer id;
  private String salary;

  public User(String name, Integer id, String salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }
}
