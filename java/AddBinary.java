public class AddBinary {
    public String addBinary(String a, String b) {
        int carry = 0;
        int ptr1 = a.length() - 1;
        int ptr2 = b.length() - 1;
        String res = "";
        while (ptr1 >= 0 && ptr2 >= 0) {
            if (carry == 1) {
                if (a.charAt(ptr1) == 49 && b.charAt(ptr2) == 49) {
                    carry = 1;
                    res = '1' + res;
                }

                else if (a.charAt(ptr1) == 49 || b.charAt(ptr2) == 49) {
                    carry = 1;
                    res = '0' + res;
                } else {
                    res = '1' + res;
                    carry = 0;
                }
            } else {
                if (a.charAt(ptr1) == 49 && b.charAt(ptr2) == 49) {
                    carry = 1;
                    res = '0' + res;
                }

                else if (a.charAt(ptr1) == 49 || b.charAt(ptr2) == 49) {
                    carry = 0;
                    res = '1' + res;
                } else {
                    res = '0' + res;
                    carry = 0;
                }
            }
            ptr1--;
            ptr2--;
        }

        while (ptr1 >= 0) {
            if (carry == 1) {
                if (a.charAt(ptr1) == 49) {
                    res = '0' + res;
                    carry = 1;
                } else {
                    res = '1' + res;
                    carry = 0;
                }
            } else {
                if (a.charAt(ptr1) == 49) {
                    res = '1' + res;
                    carry = 0;
                } else {
                    res = '0' + res;
                    carry = 0;
                }
            }
            ptr1--;
        }

        while (ptr2 >= 0) {
            if (carry == 1) {
                if (b.charAt(ptr2) == 49) {
                    res = '0' + res;
                    carry = 1;
                } else {
                    res = '1' + res;
                    carry = 0;
                }
            } else {
                if (b.charAt(ptr2) == 49) {
                    res = '1' + res;
                    carry = 0;
                } else {
                    res = '0' + res;
                    carry = 0;
                }
            }
            ptr2--;
        }
        if (carry == 1)
            res = '1' + res;
        return res;
    }
}
