public class ProjectClassTest{
    public static void main(String[] args){
        ProjectClass new1 = new ProjectClass(); //instatiates new Project object with no name or description.
        ProjectClass new2 = new ProjectClass("Project 2's Name");   //instatiates new Project object with a name but no description.
        ProjectClass new3 = new ProjectClass("Project 3's Name", "A great project with a great description!!!"); //instatiates new Project object with no name or description.
        new1.setName("Online Store Project");
        new2.setName("Pet Store Project");
        new2.setDesc("I love animals and want to help bring an animal in need of a home to a good owner with a good home");
        new2.setInitialCost(430.00);
        // new1.elevatorPitch();
        new2.elevatorPitch();
        // new3.elevatorPitch();
        // new3.setName("Donkey Meat Store");
        // System.out.println(new3.getName());
    }
}