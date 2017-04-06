package BMICalculator;

import java.io.*;
import java.util.*;

/**
 *
 * @author Koutei_Cheke
 */
public class Configuration {

    private double weight;
    private double height;
    private double bmi;
    private double womenIdealWeight;
    private double menIdealWeight;
    private PrintWriter myOutputStream = null;
    private Scanner myInputStream = null;
    private int gender;

    public Configuration() {

    }

    public void calculate() {
        bmi = BmiLogic.bmi(getWeight(), getHeight() / 100);
        menIdealWeight = BmiLogic.menIdealWeight(getHeight() / 100);
        womenIdealWeight = BmiLogic.womenIdealWeight(getHeight() / 100);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }

    public double getMenIdealWeight() {
        return menIdealWeight;
    }

    public double getWomenIdealWeight() {
        return womenIdealWeight;
    }

    public String getBmiValueText() {
        return String.format("%.2f", getBmi());
    }

    public String getClassificationText() {
        return BmiLogic.bmiClassification(getBmi());
    }

    public String getMenIdealWeightText() {
        return String.format("Debería pesar %.2f kg", getMenIdealWeight());
    }

    public String getWomenIdealWeightText() {
        return String.format("Debería pesar %.2f kg", getWomenIdealWeight());
    }
    
    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }
    
    public boolean save(int gender) {
        try {
            myOutputStream = new PrintWriter(new BufferedWriter(new FileWriter("imc.ini")));
            myOutputStream.print(String.format("%.0f %.0f %d", getHeight(), getWeight(), gender));
        } catch (IOException ex) {
            return false;
        } finally {
            if (myOutputStream != null) {
                myOutputStream.close();
            }
        }
        return true;
    }

    public boolean load() {
        try {
            myInputStream = new Scanner(new BufferedReader(new FileReader("imc.ini")));
            while (myInputStream.hasNextLine()) {
                setHeight(myInputStream.nextDouble());
                setWeight(myInputStream.nextDouble());
                setGender(myInputStream.nextInt());
            }
        } catch (IOException ex) {
            return false;
        } finally {
            if (myInputStream != null) {
                myInputStream.close();
            }
        }
        return true;
    }
}
