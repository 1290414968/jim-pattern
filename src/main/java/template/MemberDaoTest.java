package template;

import template.dao.MemberDao;

public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();
        dao.queryList(null);
    }
}
