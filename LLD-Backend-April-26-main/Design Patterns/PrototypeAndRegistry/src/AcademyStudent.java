public class AcademyStudent extends Student{
    String specilization;

    public AcademyStudent(String name, double psp, String batchName, double avgBatchPsp,
                          String specilization) {
        super(name, psp, batchName, avgBatchPsp);
        this.specilization = specilization;
    }

    public AcademyStudent(AcademyStudent student) {
        super(student);
        this.specilization = student.specilization;
    }
}
