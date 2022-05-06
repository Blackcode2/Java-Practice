public class Pet {
    private String name;
    private int age;    //in years
    private double weight;  //in pounds
   
    public Pet(String initialName, int initialAge, double initialWeight)
    {
        name = initialName;
       
        if ((initialAge < 0) || (initialWeight < 0))
        {
            System.out.println("Error: Negative age or weight.");
            this.age = 0;
            this.weight = 0.0;
        }
        else
        {
            age = initialAge;
            weight = initialWeight;
        }
    }

    public Pet() {
            this.name = "No name yet.";
            this.age = 0;
            this.weight = 0.0;
    }

    public Pet(String initialName) {
        this.name = initialName;
        this.age = 0;
        this.weight = 0.0;
    }

    public Pet(int initialAge)
    {
        name = "No name yet.";
       
        if (initialAge < 0)
        {
            System.out.println("Error: Negative age");
            this.age = 0;
            this.weight = 0.0;
        }
        else
        {
            age = initialAge;
            weight = 0.0;
        }
    }

    public Pet(double initialWeight)
    {
        name = "No name yet.";
       
        if (initialWeight < 0)
        {
            System.out.println("Error: Negative weight.");
            this.age = 0;
            this.weight = 0.0;
        }
        else
        {
            age = 0;
            weight = initialWeight;
        }
    }
   
    public String getName()
    {
        return name;
    }
   
    public int getAge()
    {
        return age;
    }
   
    public double getWeight()
    {
        return weight;
    }
   
    public void writeOutput()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " pounds");
    }

    public static void main(String[] args) {
        Pet p;
        System.out.println("\nExample 1 - No parameter");
        p = new Pet();
        p.writeOutput();
       
        System.out.println("\nExample 2-1 - Full parameter");
        p = new Pet("cat",5,2.2);
        p.writeOutput();
               
        System.out.println("\nExample 2-2 - Negative Age");
        p = new Pet("cat",-5,2.2);
        p.writeOutput();

        System.out.println("\nExample 2-3 - Negative Weight");
        p = new Pet("cat",5,-2.2);
        p.writeOutput();

        System.out.println("\nExample 3 - Name parameter");
        p = new Pet("cat");
        p.writeOutput();

        System.out.println("\nExample 4-1 - Age parameter");
        p = new Pet(5);
        p.writeOutput();

        System.out.println("\nExample 4-2 - Negative Age");
        p = new Pet(-5);
        p.writeOutput();

        System.out.println("\nExample 5-1 - Weight parameter");
        p = new Pet(2.2);
        p.writeOutput();

        System.out.println("\nExample 5-2 - Negative Weight");
        p = new Pet(-2.2);
        p.writeOutput();
    }
}
