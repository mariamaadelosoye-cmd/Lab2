public class WeightOnMars
{
    public float weightOnEarthAdelosoye= 52;
    public float weightOnMarsAdelosoye;
    public double resultVariableAdelosoye;
    public int integerVariableAdelosoye;
    public char charVariableAdelosoye;
    public int finalVariableAdelosoye;

    public void main(){
        weightOnMarsAdelosoye = weightOnEarthAdelosoye * 0.38f;
        resultVariableAdelosoye = weightOnMarsAdelosoye;
        System.out.printf("Weight On Mars, Double Value:  %.4f%n", resultVariableAdelosoye);

        // Type casting from double to integer
        integerVariableAdelosoye = (int)resultVariableAdelosoye;
        System.out.println("Cast to int: "+integerVariableAdelosoye);

        //Type casting from integer to char
        charVariableAdelosoye = (char) integerVariableAdelosoye;
        System.out.println("Cast to char: "+charVariableAdelosoye);

        finalVariableAdelosoye = (int)charVariableAdelosoye + 10;
        System.out.println("Final int result: "+finalVariableAdelosoye);

    }
}
