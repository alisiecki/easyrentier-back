package POJOs;

public class Job {

    int id;
    String town;
    String address;
    String comments;


    public Job(int id, String town, String address, String comments) {
        this.id = id;
        this.town = town;
        this.address = address;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", town='" + town + '\'' +
                ", address='" + address + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
