package com.unimanagementsys.Util.Enums;

public enum Faculty {
    PHILOSOPHY("PHL"),
    ENGINEERING("ENR"),
    ART("ART");

    private String code;

    public String getCode() {
        return code;
    }

    private Faculty(String code) {
        this.code = code;
    }

    public String getStudentFacultyCode(Faculty faculty) {
        return switch (faculty) {
            case PHILOSOPHY -> PHILOSOPHY.getCode();
            case ENGINEERING -> ENGINEERING.getCode();
            case ART -> ART.getCode();
            default -> throw new IllegalArgumentException("Unknown faculty: " + this);
        };
    }

}
