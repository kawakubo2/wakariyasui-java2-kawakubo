package test;

public enum Season {
    SPRING(1, "春"),SUMMER(2, "夏"),AUTUMN(3, "秋"),WINTER(4, "冬");

    private int code;
    private String name;
    private Season(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
}
