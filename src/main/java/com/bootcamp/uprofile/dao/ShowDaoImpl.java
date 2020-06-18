package com.bootcamp.uprofile.dao;

import com.bootcamp.uprofile.domain.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ShowDaoImpl implements ShowDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Show> findAll() {
        return jdbcTemplate.query("select * from show", new ShowRowMapper());
    }

}

class ShowRowMapper implements RowMapper<Show> {
    @Override
    public Show mapRow(ResultSet rs, int rowNum) throws SQLException {
        Show show = new Show();

        show.setId(rs.getLong("ID"));
        show.setTitle(rs.getString("TITLE"));

        return show;
    }
}
