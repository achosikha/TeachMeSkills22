public class SwitchReturn {
    public static void main(String[] args) {
        System.out.println(getSeason(10));
    }

    public static String getSeason(int month)
    {
        switch (month)
        {
            case 1, 2, 12:
                return "This is a Winter";
            case 3, 4, 5:
                return "This is a Spring";
            case 6, 7, 8:
                return "This is a Summer";
            case 9, 10, 11:
                return "This is a Autumn";
            default:
                return "There is no such month in the year...";
        }
    }
}
