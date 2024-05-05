public class Nurse {

    private String nameNurse;
    private int workExperienceYearsNurse;
    private String nameClinic;

    public Nurse(int workExperienceYearsNurse, String nameNurse, String nameClinic) {
        this.workExperienceYearsNurse = workExperienceYearsNurse;
        this.nameNurse = nameNurse;
        this.nameClinic = nameClinic;
    }
    public void giveInjections(Animal animal){
        System.out.println("Give injections: " + animal.name);
    }

    public String getNameNurse() {
        return nameNurse;
    }

    public int getWorkExperienceYearsNurse() {
        return workExperienceYearsNurse;
    }

    public String getNameClinic() {
        return nameClinic;
    }
}

