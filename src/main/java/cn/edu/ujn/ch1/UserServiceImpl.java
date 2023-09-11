package cn.edu.ujn.ch1;

public class UserServiceImpl implements IUserService{
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
