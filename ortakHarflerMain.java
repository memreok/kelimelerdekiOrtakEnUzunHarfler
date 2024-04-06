package ortakHarfler;

import java.util.ArrayList;

public class ortakHarflerMain {

	public static void main(String[] args) {

		String[] strs = { "flower", "flow", "fligth" };
		System.out.println(ortakHarfler(strs));

	}

	public static String ortakHarfler(String[] strs) {

		if (strs.length == 1) {
			return strs[0];
		}
		if (strs.length == 2) {
			for (int k = 0; k < strs.length; k++) {
				if (k + 1 < strs.length) {
					if (strs[k].contains(strs[k + 1])) {
						return strs[k + 1];

					}
				}
			}
		}

		String ortakHarflerstrs = "";
		String subString = "";
		String geciciString = "";
		int index;
		boolean flag = true;
		;
		ArrayList<String> list = new ArrayList<String>();
		for (String string : strs) {
			list.add(string);
		}
		for (String string : list) {
			index = list.indexOf(string);
			for (int i = 0; i < string.length(); i++) {
				for (int j = i + 1; j < string.length(); j++) {
					subString = string.substring(i, j);
					flag = true;
					for (String string2 : list) {

						if (!string2.contains(subString)) {
							flag = false;
							break;
						}
					}
					if (index + 1 < list.size()) {
						geciciString = list.get(index + 1);
						if (geciciString.contains(subString)) {
							if (((ortakHarflerstrs.length() < subString.length()) & (!geciciString.equals(subString))
									& (flag))) {
								ortakHarflerstrs = "";
								ortakHarflerstrs += subString;
							}
						}
					}

				}
			}

		}
		return "Ortak En Uzun Harfler: " + " ' " +  ortakHarflerstrs + " ' ";
	}

}
