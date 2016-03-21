package kewell.study.myuiproject.listview;

/**
 * Created by Administrator on 2016-03-16.
 */
public class StudentInfo {

    private  int mStudentId;
    private String mStudentName;
    private int mStudentAge;
    private int mImageId;

    public StudentInfo(int mStudentId, String mStudentName, int mStudentAge, int mImageId) {
        this.mStudentId = mStudentId;
        this.mStudentName = mStudentName;
        this.mStudentAge = mStudentAge;
        this.mImageId = mImageId;
    }

    public int getStudentId() {
        return mStudentId;
    }

    public void setStudentId(int mStudentId) {
        this.mStudentId = mStudentId;
    }

    public String getStudentName() {
        return mStudentName;
    }

    public void setStudentName(String mStudentName) {
        this.mStudentName = mStudentName;
    }

    public int getStudentAge() {
        return mStudentAge;
    }

    public void setStudentAge(int mStudentAge) {
        this.mStudentAge = mStudentAge;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int mImageId) {
        this.mImageId = mImageId;
    }
}
