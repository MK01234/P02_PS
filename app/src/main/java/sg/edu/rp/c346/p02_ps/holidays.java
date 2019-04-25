package sg.edu.rp.c346.p02_ps;

public class holidays {

    boolean isImg;
    private String title;
    private  String subtitle;
    public holidays(String title, boolean img,String subtitle) {
        this.title = title;
        this.isImg = isImg;
        this.subtitle = subtitle;
    }

    public boolean isImg() {
        return isImg;
    }

    public void setImg(boolean img) {
        isImg = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }





    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
