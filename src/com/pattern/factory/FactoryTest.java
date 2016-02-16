package com.pattern.factory;

public class FactoryTest {

    public static void main(String[] args){

//		HairInterface left = new LeftHair();
//		left.draw();

//        HairFactory factory = new HairFactory();
//		HairInterface right =  factory.getHair("right");
//		right.draw();
//
//		HairInterface left = factory.getHairByClass("com.pattern.factory.LeftHair");
//		left.draw();

//		HairInterface hair = factory.getHairByClassKey("in");
//		hair.draw();

//		PersonFactory factory = new MCFactory();
//		Girl girl = factory.getGirl();
//		girl.drawWomen();

        PersonFactory factory = new HNFactory();
        Boy boy =  factory.getBoy();
        boy.drawMan();
    }

}
