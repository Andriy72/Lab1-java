public class Clown {
    private String noseColor;
    private String costumeColor;
    private int balloons;
    private boolean mask;
    private boolean cheerful;

    public static int costOfTheClown = 0;

    public Clown() {
        noseColor = "green";
        costumeColor = "red";
        balloons = 5;
        mask = true;
        cheerful = true;

        setCostOfTheClown(balloons);
    }

    public Clown(String costumeColor, int balloons, boolean mask, boolean cheerful){
        this.costumeColor = costumeColor;
        this.balloons = balloons;
        this.mask = mask;
        this.cheerful = cheerful;
        noseColor = "green";

        setCostOfTheClown(balloons);
    }

    public Clown(String costumeColor, int balloons, boolean mask, boolean cheerful, String noseColor){
        this.noseColor = noseColor;
        this.costumeColor = costumeColor;
        this.balloons = balloons;
        this.mask = mask;
        this.cheerful = cheerful;

        setCostOfTheClown(balloons);
    }

    public String toString(){
        String maskInfo;
        String cheerfulInfo;
        String clownInfo;

        if (mask){
            maskInfo = "in mask,";
        }else {
            maskInfo = "not in the mask, ";
        }

        if (cheerful){
            cheerfulInfo = "cheerful, ";
        }else {
            cheerfulInfo = "unkind, ";
        }

        clownInfo = "Clown " + maskInfo + cheerfulInfo + "з " + noseColor + " nose, в " + costumeColor
                + " costume and " + balloons + " balloons";

        return clownInfo;
    }

    public static void printStaticSum(){
        System.out.println("Clown will cost you: " + getCostOfTheClown() + " UAH.");
    }

    public void printSum(){
        setCostOfTheClown(balloons);
        System.out.println("Cost clown: " + getCostOfTheClown() + " UAH.");
    }

    public void resetValues(String costumeColor, int balloons, boolean mask, boolean cheerful, String noseColor){
        this.noseColor = noseColor;
        this.costumeColor = costumeColor;
        this.balloons = balloons;
        this.mask = mask;
        this.cheerful = cheerful;

        setCostOfTheClown(balloons);
    }

    public String getNoseColor() {
        return noseColor;
    }

    public void setNoseColor(String noseColor) {
        this.noseColor = noseColor;
    }

    public String getCostumeColor() {
        return costumeColor;
    }

    public void setCostumeColor(String costumeColor) {
        this.costumeColor = costumeColor;
    }

    public int getBalloons() {
        return balloons;
    }

    public void setBalloons(int balloons) {
        this.balloons = balloons;
    }

    public boolean isMask() {
        return mask;
    }

    public void setMask(boolean mask) {
        this.mask = mask;
    }

    public boolean isCheerful() {
        return cheerful;
    }

    public void setCheerful(boolean cheerful) {
        this.cheerful = cheerful;
    }

    public static double getCostOfTheClown() {
        return costOfTheClown;
    }

    public static void setCostOfTheClown(int balloons) {
        costOfTheClown = 200 + balloons * 10;  // 200 грн це ціна клоуна за годину, до цієї ціни додаємо кількість кульок по 10 грн.
    }
}
