package ru.savinykh.java.core;

public class Main {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"45", "78", "41", "54"}, {"3", "56", "30", "48"}, {"56", "89", "105", "4"}, {"33", "57", "34", "79"}};
        //String[][] arr = new String[][]{{"67", "45", "34", "84", "75"}, {"42", "56", "24", "31", "75"}, {"12", "52", "60", "34", "56"}};
        //String[][] arr = new String[][]{{"16", "hi", "45", "75"}, {"56", "21", "92", "33"}, {"13", "6", "95", "15"}, {"24", "87", "31", "0"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не соответствует исходным данным!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("В массиве неверные данные!");
            System.out.println("Ошибка в ячейке: " + e.i + ":" + e.j);
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}
