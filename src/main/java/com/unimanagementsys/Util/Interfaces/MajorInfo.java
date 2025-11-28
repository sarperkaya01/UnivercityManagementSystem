package com.unimanagementsys.Util.Interfaces;

public interface MajorInfo {
    int getCode();

    String getMajor();

    default int majorCode() {
        return getCode();
    }

}
