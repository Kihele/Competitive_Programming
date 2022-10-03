    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer>grade = new ArrayList<>();
    for(int i=0;i<grades.size();i++){
        if(grades.get(i)<38 || grades.get(i)%5<3){
            grade.add(grades.get(i));
        }
        else
        {
            grade.add((grades.get(i)+5-(grades.get(i)%5)));
        }
    }
    
        return grade;
    }

}
