package utils;

public enum UnderstandingLevel {
    VERY_GOOD("大変よく分かった"),
    GOOD("分かった"),
    FAIR("あまり分からなかった"),
    POOR("ほとんど分からなかった");

    private final String label;

    UnderstandingLevel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
