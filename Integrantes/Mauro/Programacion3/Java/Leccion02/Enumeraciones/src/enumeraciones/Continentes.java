package enumeraciones;

public enum Continentes {
    AFRICA(54, "1.3 billones"),
    EUROPA(44, "746 millones"),
    ASIA(49, "4.6 billones"),
    AMERICA(35, "1.0 billones"),
    OCEANIA(14, "42 millones");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    // Métodos Get
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
