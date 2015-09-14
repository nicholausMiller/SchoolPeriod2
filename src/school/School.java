package school;
public class School {
    public static void main(String[] args) {
        Person joe = 
        Person.addPerson("Joe",Person.Gender.Male,120);
        Person jill = 
        Person.addPerson("Jill",Person.Gender.Female,105);
        jill.setName("Julie");
        Person billyJoe = 
        Person.addPerson("BillyJoe",Person.Gender.Male,210);
        
        billyJoe.getWeight();
        int val = billyJoe.getWeight();
        
        Person.printNames();
        Person.printNames(Person.Gender.Female);
        
        System.out.println(billyJoe);
        
        Course geom = 
        Course.addCourse("Geometry", Course.Type.Math, 1);
        Course photo = 
        Course.addCourse("Photography", Course.Type.Elective, 3);
        Course.printNames();
        System.out.println(photo);
        
    }
}
