package ru.itmo.task1;

public class Arcsin {
    public static double asin(double value) {
        if (Double.isNaN(value) || Math.abs(value) > 1) {
            return Double.NaN;
        }

        double sum = 0;
        double epsilon = 0.00001;
        double x = Math.abs(value);
        double prev;

        long factorialK = 1;
        long gammaK = 1;
        int k = 0;

        while (true) {
            prev = sum;
            if (value > 0){
                sum += (Math.pow(2, -k) * Math.pow(1 + x, k) * gammaK / Math.pow(2, k)) / (factorialK + 2 * k * factorialK);
            }
            else {
                sum += (Math.pow(2, -k) * Math.pow(1 - x, k) * gammaK / Math.pow(2, k)) / (factorialK + 2 * k * factorialK);
            }
            
            k++;
            factorialK *= k;
            gammaK *= k + (k % 2 == 0 ? 1 : 0);

            if (Math.abs(sum - prev) < epsilon) {
                break;
            }
        }

        if (value > 0) {
            return (-1) * Math.PI / 2 + sum * Math.sqrt(2) * Math.sqrt(1 + x);
        }
        else {
            return (-1) * (Math.PI / 2 - sum * Math.sqrt(2 - 2 * x));
        }
    }
}
