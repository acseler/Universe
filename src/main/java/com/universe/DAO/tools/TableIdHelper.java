package com.universe.DAO.tools;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by boduill on 29.09.15.
 */
@Component
public class TableIdHelper {

//    @Autowired
//    private SessionFactory sessionFactory;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private String selectId = "SELECT id_value FROM ids WHERE table_name = ?";
    private String updateId = "UPDATE ids set id_value = id_value + 1 WHERE table_name = ?";

    public int getTableId(String tableName) {
        int id = jdbcTemplate.queryForObject(selectId, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
                int res = resultSet.getInt("id_value");
                return res;
            }
        }, tableName);
        jdbcTemplate.update(updateId, tableName);
        return id;
    }
}
