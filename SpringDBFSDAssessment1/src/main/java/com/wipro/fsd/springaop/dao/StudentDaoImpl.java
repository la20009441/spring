package com.wipro.fsd.springaop.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.wipro.fsd.springaop.model.Student;

public class StudentDaoImpl implements StudentDao {

	private DataSource ds;
	private JdbcTemplate jt;

	@Override
	public void setDataSource(DataSource ds) {
		this.ds = ds;
		this.jt = new JdbcTemplate(ds);
	}

	@Override
	public Student getStudent(Integer id) {
		String sql = "select * from student where id=?";
		Student student = jt.queryForObject(sql, new Object[] { id },
				new StudentMapper());
		return student;
	}

	@Override
	public List<Student> listStudents() {
		String sql = "select * from student";
		List<Student> student = jt.query(sql, new StudentMapper());
		return student;
	}

}
