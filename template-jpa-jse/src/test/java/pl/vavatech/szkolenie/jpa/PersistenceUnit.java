package pl.vavatech.szkolenie.jpa;

/**
 * Created by Michał Kordulewski on 12.11.17.
 */
public enum PersistenceUnit {

    DEFAULT("h2"), POSTGRES("postgres"), H2("h2");

    private String name;

    PersistenceUnit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
