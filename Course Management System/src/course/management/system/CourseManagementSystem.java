
package course.management.system;


public class CourseManagementSystem {

    
    public static void main(String[] args) {
        Course myFirstCourseInThisSemister = new Course();
        myFirstCourseInThisSemister.setValue("SWE132","Java Programming with lab",4.0,"Md. Anwar Hossen",4);
        
        myFirstCourseInThisSemister.display();
        myFirstCourseInThisSemister.MonthlyClass();
        myFirstCourseInThisSemister.YearlyClass();
        
    }
    
}
