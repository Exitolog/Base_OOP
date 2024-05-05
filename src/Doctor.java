public class Doctor {
    private String nameDoctor;
    private int workExperienceDoctor;
    private String nameClinic;
    private Nurse nurse;

    public Doctor(int workExperienceDoctor,String nameDoctor, String nameClinic, Nurse nurse) {
        this.workExperienceDoctor = workExperienceDoctor;
        this.nameDoctor = nameDoctor;
        this.nameClinic = nameClinic;
        this.nurse = nurse;
    }

    public void consultIlness(Animal animal){
        System.out.println("Your illness: "+ animal.illness);
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public String getNameClinic() {
        return nameClinic;
    }

    public int getWorkExperienceDoctor() {
        return workExperienceDoctor;
    }

    public Nurse getNurse() {
        return nurse;
    }
}


