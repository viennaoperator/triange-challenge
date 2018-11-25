package com.tradeshift.triangle;

public class Triangle {

    private float lengthA;
    private float lengthB;
    private float lengthC;

    public Triangle(float lengthA, float lengthB, float lengthC) {
        if(lengthA < 1 || lengthB < 1 || lengthC < 1) throw new TriangleException("lengths of triangle can't be negative");
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    public TriangleType getType() {
        if(isEquilateral()) return TriangleType.EQUILATERAL;
        if(isIsosceles()) return TriangleType.ISOSCELES;
        if(isScalene()) return TriangleType.SCALENE;
        //no type
        throw new TriangleException("triangle type could not be defined");
    }

    private boolean isEquilateral () {
        return lengthA == lengthB && lengthB == lengthC;
    }

    private boolean isIsosceles() {
        return !isEquilateral() && (lengthA == lengthB || lengthA == lengthC || lengthB == lengthC);
    }

    private boolean isScalene() {
        return lengthA != lengthB && lengthA != lengthC && lengthB != lengthC;
    }
}
