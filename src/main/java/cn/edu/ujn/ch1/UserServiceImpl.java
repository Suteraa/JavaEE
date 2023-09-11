package cn.edu.ujn.ch1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService{
    @Autowired
    private IUserDao userDao;
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void save() {
        userDao.save();
        System.out.println("UserServiceImpl.save()");
    }
}
