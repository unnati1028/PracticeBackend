package backend.models;

import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
	@Id
	long empId;
	String empFirstName;
	String empLastName;
	long salary;
	long deptId;
}
