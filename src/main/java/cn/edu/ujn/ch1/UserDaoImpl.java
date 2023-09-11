package cn.edu.ujn.ch1;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements IUserDao{
    @Override
    public void save() {
        System.out.println("UserDaoImpl.save()");
    }
}
