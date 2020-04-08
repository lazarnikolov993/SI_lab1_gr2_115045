class Student {
    String index;
    String firstName;
    String lastName;
    List<Integer> grades;

    public Student() {
    }

    public Student(String index, String firstName, String lastName, List<Integer> grades) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getIndex() {
        return index;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    //TODO constructor
    //TODO seters & getters
    public double getAverage() {
        //TODO
        double gradeSum = 0;

        for (Integer grade : grades) {
            gradeSum += grade;
        }
        
        return gradeSum/grades.size();
    }

    public int ECTSCredits() {
        //TODO
        return grades.size() * 6;
    }
}
