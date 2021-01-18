package com.iklimov.lab11;


import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Random;
import java.util.TreeSet;

class Task2 {

    private static Random random = new Random();

    public static void main(String[] args) {

        TreeSet<Department> departments = new TreeSet<>();
        Set<Employee> departmentOneEmployees = new TreeSet<>();
        for (int i = 0; i < 200; i++) {
            departmentOneEmployees.add(new Employee("Name" + i, "Last name" + i, random.nextInt(2500) + 500));
        }
        departments.add(new Department("Department 1", new Employee("Steven", "Jones", 1251), departmentOneEmployees));
        Company company = new Company("Title", new Employee("Jack", "Smith", 2512), departments);


        // Task 1
        int maxSalary = company.director.salary;
        Iterator iterator = company.departments.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next instanceof Department) {
                Department department = (Department) next;
                if (department.head.salary > maxSalary) {
                    maxSalary = department.head.salary;
                }

                Iterator employeeIterator = department.employees.iterator();
                while (employeeIterator.hasNext()) {
                    Object employeeNext = employeeIterator.next();
                    if (employeeNext instanceof Employee) {
                        Employee employee = (Employee) employeeNext;
                        if (employee.salary > maxSalary) {
                            maxSalary = employee.salary;
                        }
                    }
                }
            }
        }
        System.out.println("Max salary is " + maxSalary);


        // Task 2
        Iterator<Department> departmentIterator = company.departments.iterator();
        while (departmentIterator.hasNext()) {
            Department department = departmentIterator.next();

            Iterator<Employee> employeeIterator = department.employees.iterator();

            boolean employeesMakeMoreThanHead = false;

            while (employeeIterator.hasNext()) {
                Employee employee = employeeIterator.next();

                if (employee.compareTo(department.head) > 0) {
                    employeesMakeMoreThanHead = true;
                }
            }

            if (employeesMakeMoreThanHead) {
                System.out.println("Employees make more money than their head in department: " + department.title);
            }
        }


        // Task 3
        TreeSet<Employee> allEmployees = new TreeSet<>();
        allEmployees.add(company.director);
        for (Department department : company.departments) {
            allEmployees.add(department.head);

            for (Employee employee : department.employees) {
                allEmployees.add(employee);
            }
        }

    }

    public static class Company {
        private String title;
        private Employee director;
        private Set<Department> departments;

        public Company(String title, Employee director, Set<Department> departments) {
            this.title = title;
            this.director = director;
            this.departments = departments;
        }

        public String getTitle() {
            return title;
        }

        public Company setTitle(String title) {
            this.title = title;
            return this;
        }

        public Employee getDirector() {
            return director;
        }

        public Company setDirector(Employee director) {
            this.director = director;
            return this;
        }

        public Set<Department> getDepartments() {
            return departments;
        }

        public Company setDepartments(Set<Department> departments) {
            this.departments = departments;
            return this;
        }
    }

    public static class Department implements Comparable {
        private String title;
        private Employee head;
        private Set<Employee> employees;

        public Department(String title, Employee head, Set<Employee> employees) {
            this.title = title;
            this.head = head;
            this.employees = employees;
        }

        public String getTitle() {
            return title;
        }

        public Department setTitle(String title) {
            this.title = title;
            return this;
        }

        public Employee getHead() {
            return head;
        }

        public Department setHead(Employee head) {
            this.head = head;
            return this;
        }

        public Set<Employee> getEmployees() {
            return employees;
        }

        public Department setEmployees(Set<Employee> employees) {
            this.employees = employees;
            return this;
        }

        @Override
        public int compareTo(Object o) {
            if (o instanceof Department) {
                Department d = (Department) o;
                return title.compareTo(d.title);
            } else {
                return 0;
            }
        }
    }

    public static class Employee implements Comparable {
        private String firstName;
        private String lastName;
        private int salary;

        public Employee(String firstName, String lastName, int salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }

        public String getFirstName() {
            return firstName;
        }

        public Employee setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public Employee setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public int getSalary() {
            return salary;
        }

        public Employee setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        @Override
        public int compareTo(Object o) {
            if (o instanceof Employee) {
                Employee e = (Employee) o;
                return Integer.compare(salary, e.salary);
            } else {
                return 0;
            }
        }
    }
}
