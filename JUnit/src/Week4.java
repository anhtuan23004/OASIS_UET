public class Week4 {
    public static int max2Int(int a, int b) {
       return Math.max(a, b);
    }

    public static int minArray (int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static String calculateBMI(double weight, double height) {
        double bmi = weight/(height*height);
        double num = Math.round(bmi * 10.0) / 10.0;
        String result = "";
        if (num < 18.5) {
            result = "Thiếu cân";
        } else if (num >= 18.5 && num < 23) {
            result = "Bình thường";
        } else if (num >= 23 && num < 25) {
            result = "Thừa cân";
        } else if (num >= 25) {
            result = "Béo phì";
        }
        return result;
    }
}
