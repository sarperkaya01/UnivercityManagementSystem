package com.unimanagementsys.Util.Enums;

import java.time.Year;

public class StudentNumberGenerator {

    public static String generateNumber(Faculty faculty, Enum<?> department) {
        // faculty null ise default
        if (faculty == null)// fakulte bos olamaz gibi bir exception yaz
            faculty = Faculty.ENGINEERING;

        // department kodunu almak için Enum<?> kullanıyoruz
        String deptCode = "";
        // if (department instanceof PhilosophyCodes) {
        // deptCode = ((PhilosophyCodes) department).getCode();
        // }
        if (department instanceof EngineeringCodes) {
            deptCode = ((EngineeringCodes) department).getMajor();
        }
        // } else if (department instanceof ArtCodes) {
        // deptCode = ((ArtCodes) department).getCode();
        else {
            throw new IllegalArgumentException("Unknown department enum: " + department);
        }

        return Year.now().getValue() + faculty.getCode() + deptCode;
    }

}
