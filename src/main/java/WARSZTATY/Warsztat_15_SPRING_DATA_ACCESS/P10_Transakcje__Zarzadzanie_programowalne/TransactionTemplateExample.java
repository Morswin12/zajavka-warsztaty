package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P10_Transakcje__Zarzadzanie_programowalne;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Slf4j
@Service
@AllArgsConstructor
public class TransactionTemplateExample {

    private static final String SQL = "INSERT INTO PERSONGORO (NAME, AGE) VALUES (:name, :age)";

    private SimpleDriverDataSource simpleDriverDataSource;
    private TransactionTemplate transactionTemplate;

    public void example1_IntegerMethodInside() {
//        Integer sum = someMethod();
//        System.out.println(sum);

//        Integer result = transactionTemplate.execute(new TransactionCallback<Integer>() {
//            @Override
//            public Integer doInTransaction(TransactionStatus status) {
//                return someMethod();
//            }
//        });
        Integer result = transactionTemplate.execute(status -> {
            Integer result2 = someMethod();
            if (true) {
                status.setRollbackOnly();
                log.error("Transaction rollback");
            }
            return result2;
                }
        );

        System.out.println("Rows: " + result);
    }

    public void example2_VoidMethodInside() {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                someVoidMethod();
                if (true) {
                    status.setRollbackOnly();
                    log.error("Transaction rollback");
                }
            }
        });
    }

    public void example2() {

    }

    private Integer someMethod() {
        int result = 0;
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(simpleDriverDataSource);

        Person person1 = Person.builder().name("Wiesiu").age(55).build();
        Person person2 = Person.builder().name("Czesiu").age(44).build();
        Person person3 = Person.builder().name("Wiesiu2").age(33).build();

        result += jdbcTemplate.update(SQL, new BeanPropertySqlParameterSource(person1));
        result += jdbcTemplate.update(SQL, new BeanPropertySqlParameterSource(person2));
        result += jdbcTemplate.update(SQL, new BeanPropertySqlParameterSource(person3));
        return result;
    }

    private void someVoidMethod() {
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(simpleDriverDataSource);

        Person person1 = Person.builder().name("Wiesiu").age(55).build();
        Person person2 = Person.builder().name("Czesiu").age(44).build();
        Person person3 = Person.builder().name("Grzesiu").age(33).build();

        jdbcTemplate.update(SQL, new BeanPropertySqlParameterSource(person1));
        jdbcTemplate.update(SQL, new BeanPropertySqlParameterSource(person2));
        jdbcTemplate.update(SQL, new BeanPropertySqlParameterSource(person3));
    }
}
