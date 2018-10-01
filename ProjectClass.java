public class ProjectClass {
//member variables
    private String name;
    private String desc;
    private Double initialCost;
//getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setInitialCost(Double numb) {
        this.initialCost = numb;
    }
    public Double getInitialCost() {
        return initialCost;
    }
    
//constructors
    public void elevatorPitch() {
        System.out.println(this.name + "($" + this.initialCost + ")" + ":" + this.desc);
    }

    public ProjectClass() {
    }
    public ProjectClass(String name) {
        this.name = name;
    }
    public ProjectClass(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    public ProjectClass(String name, String desc, Double initialCost) {
        this.name = name;
        this.desc = desc;
        this.initialCost = initialCost;
    }

}