package week7.UserRepository;

import org.postgresql.ds.PGSimpleDataSource;

import java.sql.SQLException;


public class JDBCMain {
    public static void main(String[] args) throws SQLException {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5433/aca");
        dataSource.setUser("postgres");
        dataSource.setPassword("password");
        User user = new User("name", "surname", "email");
        JDBCUserRepository jdbcUserRepository = new JDBCUserRepository(dataSource);
        jdbcUserRepository.save(user);
        jdbcUserRepository.deleteAll();
    }
}
