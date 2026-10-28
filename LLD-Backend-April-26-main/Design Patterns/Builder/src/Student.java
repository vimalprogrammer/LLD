public class Student {

    private String name;
    private double psp;
    private String batch;
    private int gradYear;
    private int mobNo;
    private String email;

//    public Student(String name,
//                   double psp,
//                   String batch,
//                   int gradYear,
//                   int mobNo) {
//        if(gradYear < 2022) {
//            throw new RuntimeException("Grad year should be greate than 2022");
//        }
//        // val 2
//        // val 3
//    }

//    public Student(Map<String, Object> map) {
//        this.name = (String)map.get("name");
//        this.psp = (Double) map.get("psp");
//    }

    public static Builder getBuilder() {
        return new Builder();
    }

    private Student(Builder builder) {
        this.name = builder.getName();
        this.psp = builder.getPsp();
    }

    static class Builder {

        private String name;
        private double psp;
        private String batch;
        private int gradYear;
        private int mobNo;
        private String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setMobNo(int mobNo) {

            this.mobNo = mobNo;
            return this;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public double getPsp() {
            return psp;
        }

        public String getBatch() {
            return batch;
        }

        public int getGradYear() {
            return gradYear;
        }

        public int getMobNo() {
            return mobNo;
        }

        public String getEmail() {
            return email;
        }

        public void validate() {
            if(this.getGradYear() < 2022) {
                throw  new RuntimeException();
            }
            // val 3
            // val 4
        }

        public Student build() {
            validate();
            return new Student(this);
        }
    }

}
