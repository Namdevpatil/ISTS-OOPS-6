package com.javaJDBCTransactionManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SaveEmployee 
{

	public static void main(String[] args)throws SQLException
	{
		
		Connection connection = null;
		Scanner scanner = null;
		
		try
		{
			
			while(true)
			{
				
				connection = DatabaseConnection.getDatabaseConnection();
				
				connection.setAutoCommit(false);
				
				String query = "insert into employee(employee_id, employee_name, employee_role, employee_salary) values(?,?,?,?)";
				
				
				PreparedStatement ps = connection.prepareStatement(query);
				
				scanner = new Scanner(System.in);
				
				System.out.println("enter employee id: ");
				int id = scanner.nextInt();
				
				scanner.nextLine();
				
				System.out.println("enter employee name: ");
				String name = scanner.nextLine();
				
				System.out.println("enter employee role: ");
				String role = scanner.nextLine();
				
				System.out.println("enter employee salary: ");
				double salary = scanner.nextDouble();
				
				Employee employee1 = new Employee(id, name, role, salary);
				
				ps.setInt(1, employee1.getEmployeeId());
				ps.setString(2, employee1.getEmployeeName());
				ps.setString(3, employee1.getEmployeeRole());
				ps.setDouble(4, employee1.getEmployeeSalary());
				
				ps.executeUpdate();
				
				System.out.println("want to 'commit/rollback' employee object?");
				String input = scanner.next().toLowerCase();
				
				if(input.equals("commit"))
				{
					connection.commit();
				}
				else if(input.equals("rollback"))
				{
					connection.rollback();
				}
				
				System.out.println("want to save employee object? 'yes/no'");
				String answer = scanner.next().toLowerCase();
				
				if(answer.equals("no"))
				{
					break;
				}
				
			}
			
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally {
			
			connection.close();
			scanner.close();
		}

	}

}
