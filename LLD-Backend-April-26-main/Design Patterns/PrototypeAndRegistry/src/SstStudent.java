public class SstStudent extends Student{

    int credits;

    public SstStudent(String name, double psp, String batchName, double avgBatchPsp, int credit) {
        super(name, psp, batchName, avgBatchPsp);
        this.credits = credit;
    }
}
