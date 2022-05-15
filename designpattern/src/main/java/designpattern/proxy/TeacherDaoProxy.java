package designpattern.proxy;

public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("准备上课");
        target.teach();
        System.out.println("上课结束");
    }
}
