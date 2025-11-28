package com.unimanagementsys.Util.Enums.MajorEnums;

import com.unimanagementsys.Util.Interfaces.MajorInfo;

public enum ArtCodes implements MajorInfo {
    STATUE(001, "Software Engineering"),
    PAINTING(002, "Architecture"),
    ACTING(003, "Civil Engineering");

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

    private ArtCodes(int code, String major) {
        this.code = code;
        this.major = major;
    }

}
