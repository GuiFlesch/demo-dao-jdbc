package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("----TEST 1: department insert---- ");
        Department department = new Department(null,"Music");
        departmentDao.insert(department);
        System.out.println("Inserted! New id = " + department.getId());

    }
}
