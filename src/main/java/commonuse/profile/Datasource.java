package commonuse.profile;

public class Datasource {
    private String dburl;

    public Datasource(String dburl) {
        this.dburl = dburl;
    }

    public String getDburl() {
        return dburl;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }
}
