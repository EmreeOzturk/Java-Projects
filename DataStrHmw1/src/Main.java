import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        float[] arr =  new float[5];
        arr[0] = 12.345f;
        arr[1] = 23.346523f;
        arr[2] = 566.123523f;
        arr[3] = 29.3123523f;
        arr[4] = 623.87914f;
    }
    public static String[] uniqueNumbers(float[] arr){
        String[] rt = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String curr = String.valueOf(arr[i]);
            int min = Math.min(curr.length()-1, (curr.indexOf(".") + 4));
            for (int j = 0; j <= min; j++) {
                for (int k = j+1; k <= min; k++) {
                    if (curr.charAt(j) == curr.charAt(k)) {
                        rt[i] = "Not Include Unique Numbers";
                        j =  min;
                    }
                }
            }
            if (rt[i] == null){
                rt[i] = "Include Unique Numbers";
            }
            System.out.println(rt[i]);
        }
        return rt;
    }
}
