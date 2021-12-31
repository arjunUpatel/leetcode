public class ReverseInteger {
	public int reverse(int x) {
		String str = "" + x, revStr = "";
		int sign = 1;
		if (x < 0) {
			sign = -1;
			str = str.substring(1);
		}
		for (int i = str.length(); i > 0; i--) {
			revStr += str.substring(i - 1, i);
		}
		int result;
		try {
			result = Integer.parseInt(revStr) * sign;
		} catch (Exception e) {
			result = 0;
		}
		return result;
	}
}
