public class Bicycle // class header - note capital letter for class name
{
    private String colour; // field - access modifier (private), type (String), name of the field (colour)
    private int numberOfGears;

    public Bicycle(String aColour, int aNumber) // two parameter constructor
    {
        this.colour = aColour; // initialising field with parameter value
        this.numberOfGears = aNumber;
    }

    public String getColour() // access modifier (public), type (String), name (getColour)
    {
        return colour; // return the value of the field
    }

    public int getNumberOfGears()
    {
        return numberOfGears;
    }

}
