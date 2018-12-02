package solutions.tveit.nissanconnect;

public enum Region {
    USA("NNA"),
    EUROPE("NE"),
    CANADA("NCI"),
    AUSTRALIA("NMA"),
    JAPAN("NML");

    private final String regionCode;

    Region(String regionCode) {
        this.regionCode = regionCode;
    }

    public String code() {
        return regionCode;
    }
}
