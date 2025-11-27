package com.unimanagementsys.Util.Enums;

public enum EngineeringCodes {
    SOFTWARE(001, "Software Engineering"),
    ARCITECTURE(002, "Architecture"),
    CIVIL(003, "Civil Engineering");

    private int code;
    private String major;

    public int getCode() {
        return code;
    }

    public String getMajor() {
        return major;
    }

    private EngineeringCodes(int code, String major) {
        this.code = code;
        this.major = major;
    }

    public int getMajorCode() {
        return switch (this) {
            case SOFTWARE -> SOFTWARE.getCode();
            case ARCITECTURE -> ARCITECTURE.getCode();
            case CIVIL -> CIVIL.getCode();
            default -> throw new IllegalArgumentException("Unknown faculty: " + this);
        };
    }

}
