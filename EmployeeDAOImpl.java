package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//DAO layer must not take any BUSINESS DECISION

//BUSINESS DECISION IS DONE AT THE SERVICE LAYER

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection conn;
	
	public EmployeeDAOImpl() {
		 System.out.println("EmployeeDAOImpl()");   	
	        try {
				Class.forName("org.hsqldb.jdbc.JDBCDriver");
				System.out.println("Database Driver loaded....");
				conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			    System.out.println("Connected to the DB : "+conn);	
				  
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	@Override
	public void addEmployee(Employee emp) {
		try {
			PreparedStatement pst = conn.prepareStatement("insert into employee values (?,?,?)");
			pst.setInt(1, emp.getEmpno());
			pst.setString(2, emp.getName());
			pst.setDouble(3, emp.getSalary());
			int row  = pst.executeUpdate();
			System.out.println("Employee created : "+row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmployee(Employee emp) {
		try {
			PreparedStatement pst = conn.prepareStatement("update employee set empname=?, salary=? where empno=?");
			pst.setInt(3, emp.getEmpno()); //WHERE clause
			pst.setString(1, emp.getName()); //COLUMN to update
			pst.setDouble(2, emp.getSalary()); //COLUMN to update
			int row  = pst.executeUpdate();
			System.out.println("Employee udpated : "+row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteEmployee(int empno) {
		try {
			PreparedStatement pst = conn.prepareStatement("delete from employee where empno=?");
			pst.setInt(1, empno); //WHERE clause
			
			int row  = pst.executeUpdate();
			System.out.println("Employee deleted : "+row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Employee getEmployee(int x) {
		Employee emp =null;
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from  employee where empno="+x);
			if(rs.next() ) {
				emp = new Employee();
				emp.setEmpno(rs.getInt(1)); 
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				System.out.println("rs "+rs);
			}
			else {
				emp = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Employee> getEmployees() {
		
		List<Employee> empList = new ArrayList<Employee>();
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from  employee");
			while(rs.next() ) {
				Employee emp = new Employee();
				emp.setEmpno(rs.getInt(1));;
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				empList.add(emp); // add each row fetched into the list
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}

}
