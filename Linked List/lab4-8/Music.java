package lab4.pkg8;
//@author Kisyok Indran Veerasamy

public class Music implements Comparable<Music> {

    private String title;
    private String fileName;

    public Music(String title, String fileName) {
        this.title = title;
        this.fileName = fileName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTitle() {
        return title;
    }

    public String getFileName() {
        return fileName;
    }

    public String toString() {
        return "Music : " + title;
    }

    @Override
    public int compareTo(Music o) {
        return 0;
    }
}
