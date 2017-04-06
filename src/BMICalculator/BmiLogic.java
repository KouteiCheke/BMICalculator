package BMICalculator;

public class BmiLogic {
    
    
    /**
     * Returns IMC
     * @param weight in Kgs
     * @param height la meters
     * @return the IMC
     */
    public static double bmi(double weight, double height) {
        return weight / (height * height);
    }
    
    /**
     * Returns weight BMI 'classification of a person according to it
     * @param imc result of bmi
     * @return a string with the classification
     */
    public static String bmiClassification(double imc) {
        String r;
        if (imc < 18.5) {   
            r = "Bajo peso";
        } else if (imc >= 18.5 && imc <= 24.99) {
            r = "Peso ideal";
        } else if (imc >= 25 && imc <= 29.99) {
            r = "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.99) {
            r = "Obesidad I";
        } else if (imc >= 35 && imc <= 39.99) {
            r = "Obesidad II";
        } else if (imc >= 40 && imc <= 49.99) {
            r = "Obesidad III";
        } else {
            r = "Obesidad IV";
        }
         return r;
    }

   
    public static double womenIdealWeight(double weight) {
        return weight * 100 - 100 - (weight * 100 - 150) / 2;
    }
    
    public static double menIdealWeight(double weight) {
        return weight * 100 - 100 - (weight * 100 - 150) / 4;
    }    
}