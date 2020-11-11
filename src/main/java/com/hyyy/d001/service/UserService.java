package com.hyyy.d001.service;

import com.hyyy.d001.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Integer add() {
        String sql = "insert into user value(?,?)";

        return jdbcTemplate.update(sql,8,"kk");
    }

    public Integer updateUser() {
        return jdbcTemplate.update("update user set name=? where id=?","yy", '1');
    }


    public Integer deleteUserById(Integer id) {
        return jdbcTemplate.update("delete from user where id=?", id);
    }

//    public List<User> getAllUser() {
//        return jdbcTemplate.query("select id,username,address from user", new RowMapper<User>() {
//            @Override
//            public User mapRow(ResultSet resultSet, int i) throws SQLException {
//                User user = new User();
//                user.setId(resultSet.getInt(1));
//                user.setUsername(resultSet.getString(2));
//                user.setAddress(resultSet.getString(3));
//                return user;
//            }
//        });
//
//    }

        public List<User> getAll() {
            List jj =jdbcTemplate.queryForList("select * from user ");
        return jj;

        }

}
