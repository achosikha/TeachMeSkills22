package PC;

public class RAM {
    private String name;
    private double size;

    public RAM(String name, double size)
    {
        this.name = name;
        this.size = size;
    }

    public String getRAMInfo()
    {
        return "RAM name: " + this.name + "\n" +
                "RAM size: " + this.size + "\n";
    }
}
