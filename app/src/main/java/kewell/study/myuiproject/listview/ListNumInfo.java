package kewell.study.myuiproject.listview;

/**
 * Created by Administrator on 2016-03-22.
 */
public class ListNumInfo {

    private String tetetee;
    private String mNumName;
    private boolean mIsChecked = false;

    public ListNumInfo(String numName) {
        this.mNumName = numName;
    }

    public String getNumName() {
        return mNumName;
    }

    public void setNumName(String numName) {
        this.mNumName = numName;
    }

    public boolean getIsChecked() {
        return mIsChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.mIsChecked = isChecked;
    }
}
