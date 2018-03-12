package com.shsxt.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

/**
 * 类型装换器
 * 
 * String - varchar之间的相互装换
 * 
 * @author Mr.YongGan.Zhang
 * @versin 1.0.0
 * @since JDK1.8
 */

@MappedJdbcTypes(JdbcType.VARCHAR)
public class ExampleTypeHandler extends BaseTypeHandler<String> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType)
			throws SQLException {
		
		System.err.println(" setNonNullParameter ...");
		
		//设置参数值
		ps.setString(i, parameter);

	}

	@Override
	public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
	
		System.err.println("getNullableResult ..在RS对象中取值 ");
		
		return rs.getString(columnName);
	}

	@Override
	public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return rs.getString(columnIndex);
	}

	
	@Override
	public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
	
		return null;
	}

}
