package classandobjectsB;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public static Location locateLargest(double[][] matrix){
        Location location = new Location();
        location.row = -1;
        location.column = -1;
        location.maxValue = Double.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if(matrix[i][j] > location.maxValue)
                {
                    location.maxValue = matrix[i][j];
                    location.row = i;
                    location.column = j;
                }
        return location;
    }

    @Override
    public String toString() {
        String str = "The location of the largest element is " + Double.toString(maxValue) + " at (" + Integer.toString(row) + ", " + Integer.toString(column) + ")";
        return str;
    }
}
