package kewell.study.myuiproject.gridview;

/**
 * Created by Administrator on 2016-03-16.
 */
public class ImageInfo {

    private String mImageText;
    private int mImageId;

    public ImageInfo(String imageText, int imageId) {
        this.mImageText = imageText;
        this.mImageId = imageId;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        this.mImageId = imageId;
    }

    public String getImageText() {
        return mImageText;
    }

    public void setImageText(String imageText) {
        this.mImageText = imageText;
    }
}
