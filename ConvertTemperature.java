
//Q20> You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.

//You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].


//code :

public class ConvertTemperature {
    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[] {kelvin, fahrenheit};
    }

    public static void main(String[] args) {
        double celsius = 36.50;
        double[] result = convertTemperature(celsius);
        System.out.println(result[0] + " " + result[1]);
    }
}

