package com.nt.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;
import com.nt.vo.EmployeeVO;

public final class EmployeeDAOImpl implements EmployeeDAO {
	private  static final  String   EMPLOYEE_INSERT_QUERY="INSERT INTO SPRING_EMPLOYEE VALUES(SNO_SEQ1.NEXTVAL,?,?,?,?)";
	private  DataSource ds;

	 //for constructor injection  (alt+shift+s,o)
		public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		EmployeeVO vo=new EmployeeVO();
		SimpleDateFormat sdf=new SimpleDateFormat("DD-MM-YYYY");
		java.util.Date udob=null;
		udob=sdf.parse(vo.getDoj());
		Date sqlDate=Date.valueOf(vo.getDoj());
		long ms=udob.getTime();
		java.sql.Date sqdob=new java.sql.Date(ms);
		//get pooled jdbc connection
		con=ds.getConnection();
		//create PreparedStatement object
		ps=con.prepareStatement(EMPLOYEE_INSERT_QUERY);
		//set values to query params
		ps.setString(1,bo.getEname());
		ps.setString(2,bo.getEadd());
		ps.setDate(3,sqdob);
		ps.setFloat(4,bo.getBasicSalary());
		//execute the SQL query
		count=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return count;
	}

}