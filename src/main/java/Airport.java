public class Airport {
    int id;
    String bizName;
    String adress;
    String city;

//egzistuojancio yraso krekcija


    public Airport(int id, String bizName, String adress, String city) {
        this.id = id;
        this.bizName = bizName;
        this.adress = adress;
        this.city = city;
    }
//konstruktorius skirtas sukurti naujo yraso sukurimui(dar neyrasytas y data base)
    public Airport(String bizName, String adress, String city) {
        this.bizName = bizName;
        this.adress = adress;
        this.city = city;
    }

    public Airport() {
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
