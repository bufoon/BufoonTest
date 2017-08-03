package com.bufoon.test.gof.simpleFactory;

public class Main {

	public static void main(String[] args) {
		SkateVendorI skateVendor1 = SkateFactory.newSkateVendor(1);
		skateVendor1.createSkate();
		SkateVendorI skateVendor2 = SkateFactory.newSkateVendor(2);
		skateVendor2.createSkate();
	}

}
