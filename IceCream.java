//***********************************************************
// IceCream.java
//
// Demonstrates the use of enumerated types.
//***********************************************************

public class IceCream
{
    enum Flavor {vanilla, chocolate, strawberry, fudgeRipple, coffee, rockyRoad, mintChocolateChip, cookieDough}

    //-----------------------------------------------------------------
    //  Creates and uses variables of the Flavor type.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Flavor cone1, cone2;

        cone1 = Flavor.mintChocolateChip;
        cone2 = Flavor.cookieDough;

        System.out.println("cone1 value: " + cone1);
        System.out.println("cone1 ordinal: " + cone1.ordinal());

        System.out.println("cone2 value: " + cone2);
        System.out.println("cone2 ordinal: " + cone2.ordinal());
    }
}