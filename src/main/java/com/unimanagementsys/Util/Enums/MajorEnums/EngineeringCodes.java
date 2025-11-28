package com.unimanagementsys.Util.Enums.MajorEnums;

import com.unimanagementsys.Util.Interfaces.MajorInfo;

public enum EngineeringCodes implements MajorInfo {
    SOFTWARE(001, "Software Engineering"),
    ARCITECTURE(002, "Architecture"),
    CIVIL(003, "Civil Engineering");

    private final int code;
    private final String major;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMajor() {
        return major;
    }

    private EngineeringCodes(int code, String major) {
        this.code = code;
        this.major = major;
    }

    // public int getMajorCode() {
    // return switch (this) {
    // case SOFTWARE -> SOFTWARE.getCode();
    // case ARCITECTURE -> ARCITECTURE.getCode();
    // case CIVIL -> CIVIL.getCode();
    // default -> throw new IllegalArgumentException("Unknown faculty: " + this);
    // };
    // }

}
