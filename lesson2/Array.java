package lesson2;

public class Array {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] validArray = new String[][]
                        {{"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}};

        String[][] wrongSizeArray = new String[][]
                        {{"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"}};

        String[][] wrongDataArray = new String[][]
                        {{"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "null"}};

        mainMethod(validArray);

        try{
            mainMethod(wrongSizeArray);}
        catch (MyArraySizeException e){
            e.printStackTrace();
        }

        try{
        mainMethod(wrongDataArray);}
        catch (MyArrayDataException e){
            e.printStackTrace();
        }
    }

    public static void mainMethod(String[][] Array) throws MyArraySizeException, MyArrayDataException {
        checkSizeArray(Array);
        checkIntArray(Array);
        System.out.println("Cумма всех элементов массива равна: " + checkSumArray(Array));

    }

    public static void checkSizeArray(String[][] Array) throws MyArraySizeException {
        if (Array.length != 4){
            throw new MyArraySizeException("Не верный размер массива!");
        }
    }

    public static void checkIntArray(String[][] Array) throws MyArrayDataException{
        int row;
        int col;
        for (row = 0; row < Array.length; row++){
            for (col = 0; col < Array[row].length; col++){
                try {Integer.parseInt(Array[row][col]);}
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не правильный тип " + "ROW " + (row+1) + " COL " + (col+1));
                }
            }
        }
    }

    public static int checkSumArray(String[][] Array){
        int result = 0;
        for (int i = 0; i < Array.length; i++){
            for (int j = 0; j < Array.length; j++){
                result += Integer.parseInt(Array[i][j]);
            }
        }
        return result;
    }

}
