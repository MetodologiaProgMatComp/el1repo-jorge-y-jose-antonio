package es.uah.matcomp.mp.e1.ejerciciosclases.Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {

        int id = 101;
        Employee employee = new Employee(id, "Elena", "Lopez", 50000);

        assertEquals(id, employee.getId());

    }

    @Test
    void getFirstName() {

        String firstName = "Susana";
        Employee employee = new Employee(102, firstName, "Gonzalez", 60000);

        assertEquals(firstName, employee.getFirstName());

    }

    @Test
    void getLastName() {

        String lastName = "Lopez";
        Employee employee = new Employee(103, "Jose", lastName, 70000);

        assertEquals(lastName, employee.getLastName());

    }

    @Test
    void getName() {

        Employee employee = new Employee(104, "Jose", "Lopez", 80000);

        assertEquals("JoseLopez", employee.getName());

    }

    @Test
    void getSalary() {

        int salary = 90000;
        Employee employee = new Employee(105, "Guillermo", "Moreno", salary);

        assertEquals(salary, employee.getSalary());

    }

    @Test
    void setSalary() {

        Employee employee = new Employee(106, "Alvaro", "Bravo", 100000);

        int NuevoSalary = 110000;
        employee.setSalary(NuevoSalary);

        assertEquals(NuevoSalary, employee.getSalary());

    }

    @Test
    void getAnnualSalary() {

        int salary = 120000;
        Employee employee = new Employee(107, "Mark", "Evans", salary);

        assertEquals(12 * salary, employee.getAnnualSalary());

    }

    @Test
    void raiseSalary() {

        int SalaryInicial = 130000;
        Employee employee = new Employee(108, "Angela", "Moreno", SalaryInicial);

        int Porcentaje = 10;
        int SalarySubido = employee.raiseSalary(Porcentaje);

        assertEquals(SalaryInicial + (SalaryInicial * Porcentaje / 100), SalarySubido);
        assertEquals(SalaryInicial + (SalaryInicial * Porcentaje / 100), employee.getSalary());
        //Comprobarlo tant con la propia funcion como probar si se ha actualizado usando el getSalary

    }

    @Test
    void testToString() {

        Employee employee = new Employee(109, "Guillermo", "Moreno", 140000);

        String StringEsperada = "Employee[id=109, Name=Guillermo Moreno, salary=140000]";
        assertEquals(StringEsperada, employee.toString());

    }
}