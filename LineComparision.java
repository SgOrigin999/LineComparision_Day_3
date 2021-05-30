package com.bridgelab.linecomparison.day3;

public class LineComparision {
	public static double calculateLength(double x1, double x2, double y1, double y2) {
		double distance;
		distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		// distance = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		return distance;
	}

	public static boolean calculateLength(double x1, double x2, double y1, double y2, double p1, double p2, double q1,
			double q2) {
		double distance1, distance2;
		distance1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		System.out.println("Distance1::" + distance1);
		distance2 = Math.sqrt(Math.pow((p1 - p2), 2) + Math.pow((q1 - q2), 2));
		System.out.println("Distance2::" + distance2);
		Double obj1 = new Double(distance1);
		Double obj2 = new Double(distance2);
		if (obj1.equals(obj2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparision And Computation Problem:");
		System.out.println("Calculate Line of Length::");
		double x1 = (Math.random() * 7);
		double x2 = (Math.random() * 6);
		double y1 = (Math.random() * 8);
		double y2 = (Math.random() * 10);

		double p1 = (Math.random() * 7);
		double p2 = (Math.random() * 6);
		double q1 = (Math.random() * 8);
		double q2 = (Math.random() * 10);
		double totalLength = calculateLength(x1, x2, y1, y2);
		System.out.println("Distance Of Line::" + totalLength);
		System.out.println("Calculate Equality of two Lines::");
		boolean checkLength = calculateLength(x1, x2, y1, y2, p1, p2, q1, q2);
		System.out.println("Distance Of Line::" + checkLength);
	}
}
