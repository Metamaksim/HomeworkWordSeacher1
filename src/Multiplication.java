public class Multiplication {

    public static StringBuffer multiplication() {
        StringBuffer result = new StringBuffer();
        for (int i = 1; i < 11; i++) {
            for (int k = 1; k < 11; k++) {
                String preresult = (k * i + " ");
                result.append(preresult);
            }

            String preresult1 = ("\n");
            result.append(preresult1);
        }
        return result;
    }
}