<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration
 PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
 "https://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
	<environments default="development">
		<environment id="development">
			<transactionManager type="JDBC" />
			<dataSource type="POOLED">
				<property name="driver" value="oracle.jdbc.driver.OracleDriver" />
				<property name="url" value="jdbc:oracle:thin:@localhost:1521:xe" />
				<property name="username" value="c##nohssam" />
				<property name="password" value="1111" />
			</dataSource>
		</environment>
	</environments>
	<mappers>
		<mapper resource="network/com/ict/edu9_db/mapper.xml" />
	</mappers>
</configuration>