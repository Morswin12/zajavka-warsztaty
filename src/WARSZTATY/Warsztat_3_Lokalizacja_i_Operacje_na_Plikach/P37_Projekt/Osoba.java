package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P37_Projekt;

public class Osoba {
    private final String first_name;
    private final String last_name;
    private final String email;
    private final String ip;

    public Osoba(String first_name, String last_name, String email, String ip) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.ip = ip;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return " " + first_name+ " " + last_name +
                ", email='" + email + '\'' +
                ", ip='" + ip + '\'';
    }
}
