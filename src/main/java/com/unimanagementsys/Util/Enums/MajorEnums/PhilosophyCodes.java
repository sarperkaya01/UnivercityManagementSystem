package com.unimanagementsys.Util.Enums.MajorEnums;

import com.unimanagementsys.Util.Interfaces.MajorInfo;

public enum PhilosophyCodes implements MajorInfo {
    EPISTEMOLOGY(001, "Epistemology Philosophy"),
    ETHICS(002, "Ethics Philosophy"),
    LOGIC(003, "Logic Philosophy");

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

    private PhilosophyCodes(int code, String major) {
        this.code = code;
        this.major = major;
    }

}
