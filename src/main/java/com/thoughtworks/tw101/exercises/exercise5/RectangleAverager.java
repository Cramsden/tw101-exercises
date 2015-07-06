package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int totalAreas = 0;
        int numRects = rectangles.length;
        for (int i=0; i<numRects; i++)
        {
            totalAreas += rectangles[i].area();
        }
        return totalAreas/numRects;
    }
}
