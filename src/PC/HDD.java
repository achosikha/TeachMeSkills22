package PC;

public class HDD {
    private String name;
    private double size;
    private String type;

    public HDD(String name, double size, String type)
    {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getHDDInfo()
    {
        return "HDD name: " + this.name + "\n" +
                "HDD size: " + this.size + "\n" +
                "HDD type: " + this.type;
    }
}
