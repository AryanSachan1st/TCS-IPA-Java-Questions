package Coding35Marks.Solutions;

class Institution {
    private int id, placedStudents, clearedStudents;
    private String name, location, grade;

    public Institution(int id, String name, int placedStudents, int clearedStudents, String location, String grade) {
        this.id = id;
        this.name = name;
        this.placedStudents = placedStudents;
        this.clearedStudents = clearedStudents;
        this.location = location;
        this.grade = grade;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPlacedStudents(int placedStudents) {
        this.placedStudents = placedStudents;
    }
    public void setClearedStudents(int clearedStudents) {
        this.clearedStudents = clearedStudents;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // getters
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getPlacedStudents() {
        return this.placedStudents;
    }
    public int getClearedStudents() {
        return this.clearedStudents;
    }
    public String getLocation() {
        return this.location;
    }
    public String getGrade() {
        return this.grade;
    }
}

public class Solution3 {

    private static int findNumClearanceByLoc(Institution[] institutions, String location) {
        int totalClearedStudents = 0;

        for (Institution inst: institutions) {
            if (inst.getLocation().equalsIgnoreCase(location)) {
                totalClearedStudents += inst.getClearedStudents();
            }
        }

        return totalClearedStudents;
    }
    private static Institution updateInstitutionGrade(Institution[] institutions, String instName) {
        for (Institution inst: institutions) {
            if (inst.getName().equalsIgnoreCase(instName)) {
                double rating = (inst.getPlacedStudents() * 100)/ inst.getClearedStudents();

                if (rating >= 80) {
                    inst.setGrade("A");
                } else {
                    inst.setGrade("B");
                }

                return inst;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        Institution[] institutions = {
            new Institution(1, "TCS", 180, 200, "Chennai", "A"),
            new Institution(2, "Infosys", 120, 160, "Bangalore", "B"),
            new Institution(3, "Wipro", 90, 100, "Chennai", "A")
        };

        // For FindNumClearancedByLoc method - The main method should print the noOfClearance as it is, if the returned value is
        // greater than 0, or it should print "There are no cleared students in this particular location".
        int noOfClearance = findNumClearanceByLoc(institutions, "Chennai");
        if (noOfClearance > 0) {
            System.out.println(noOfClearance);
        } else {
            System.out.println("There are no cleared students in this particular location");
        }

        // For UpdateInstitutionGrade method - The main method should print the institutionName and grade of the returned Institution
        // object. The instituationName and grade should be concatinated with :: while printing. eg:- TCS::A, where TCS is the
        // institution name and A is the grade.
        // If the returned value is null then it should print "No Institute is available with the specified name".
        Institution updatedInstitution = updateInstitutionGrade(institutions, "TCS");
        if (updatedInstitution != null) {
            System.out.println(updatedInstitution.getName() + "::" + updatedInstitution.getGrade());
        } else {
            System.out.println("No Institute is available with the specified name");
        }
    }
}
