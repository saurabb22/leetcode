class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder result = new StringBuilder();

        // Handle sign
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Convert to long to avoid overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Integer part
        result.append(num / den);
        long rem = num % den;

        if (rem == 0) {
            return result.toString();
        }

        result.append(".");
        Map<Long, Integer> remainderPos = new HashMap<>();

        while (rem != 0) {
            if (remainderPos.containsKey(rem)) {
                // Repeat detected → insert '('
                int pos = remainderPos.get(rem);
                result.insert(pos, "(");
                result.append(")");
                break;
            }
            remainderPos.put(rem, result.length());
            rem *= 10;
            result.append(rem / den);
            rem %= den;
        }

        return result.toString();
    }
}
