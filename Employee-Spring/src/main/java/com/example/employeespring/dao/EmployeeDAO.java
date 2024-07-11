package com.example.employeespring.dao;

import com.example.employeespring.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeDAO {
    private final JdbcTemplate jdbcTemplate;

    public EmployeeDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> findAll() {
        return jdbcTemplate.query("SELECT * FROM Employee", new EmployeeRowMapper());
    }

    public Employee findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM Employee WHERE id = ?", new EmployeeRowMapper(), id);
    }

    public int save(Employee employee) {
        return jdbcTemplate.update("INSERT INTO Employee (name, department) VALUES (?, ?)",
                employee.getName(), employee.getDepartment());
    }

    public int update(Employee employee) {
        return jdbcTemplate.update("UPDATE Employee SET name = ?, department = ? WHERE id = ?",
                employee.getName(), employee.getDepartment(), employee.getId());
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM Employee WHERE id = ?", id);
    }

    private static class EmployeeRowMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee = new Employee();
            employee.setId(rs.getInt("id"));
            employee.setName(rs.getString("name"));
            employee.setDepartment(rs.getString("department"));
            return employee;
        }
    }
}
