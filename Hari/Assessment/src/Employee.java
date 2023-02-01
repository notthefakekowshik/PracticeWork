
public class Employee {

    private String ename;
    private String eloc;
    private int eage;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEloc() {
        return eloc;
    }

    public void setEloc(String eloc) {
        this.eloc = eloc;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    Employee(String ename, String eloc, int eage){
        this.ename=ename;
        this.eloc=eloc;
        this.eage=eage;
    }
}
