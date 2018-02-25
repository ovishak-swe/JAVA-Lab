
package course.management.system;


public class Course {
    String CourseCode;
    String CourseName;
    Double CourseCredit;
    String CourseTeacher;
    int WeeklyClass;
    
    public void setValue (String CourseCode,String CName,Double CCredit,String CTeacher,int WClass)
    {
        this.CourseCode=CourseCode;
        CourseName=CName;
        CourseCredit=CCredit;
        CourseTeacher=CTeacher;
        WeeklyClass=WClass;
    }
    public void MonthlyClass()
    {
        System.out.println("MonthlyClass:"+WeeklyClass*4);
        
    }
     public void YearlyClass()
     {
         System.out.println("YearlyClass:"+WeeklyClass*52);
     }
     public void display()
     {
         System.out.println("Course Code:"+CourseCode+"\nCourse Name:"+CourseName+"\n Course Credit:"+CourseCode+"\nCourse Teacher:"+CourseTeacher);
     }
    
            
            

    
        }
    
    

