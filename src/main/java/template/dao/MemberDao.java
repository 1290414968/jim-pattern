package template.dao;

import template.JdbcTemplate;
import template.RowMapper;
import template.entity.Member;

import java.sql.ResultSet;
import java.util.List;

public class MemberDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);
    public List<?> queryList(Object [] paramValue){
        String sql = "select * from member";
        return jdbcTemplate.executeQuery(sql, new RowMapper() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setId(rs.getLong("id"));
                member.setName(rs.getString("name"));
                return member;
            }
        },paramValue);
    }
}
