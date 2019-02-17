package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Vector;

public class Calculator {
    public static int prodOfEvenElem(Vector vector){
        int prodOfElem = 1;

        if (vector == null){
            return prodOfElem;
        }

        int[] intArray = vector.getElements();

        if (intArray == null){
            return prodOfElem;
        }

        for (int i = 0; i < intArray.length; i += 2){
            prodOfElem *= intArray[i];
        }

        return prodOfElem;
    }

    public static int sumOfElemBetweenFirstAndLastZero(Vector vector){
        int sumOfElem = 0;

        if (vector == null){
            return sumOfElem;
        }

        int[] intArray = vector.getElements();

        if (intArray == null){
            return sumOfElem;
        }

        int indexFirst = indexOfFirstZero(vector);
        int indexLast = indexOfLastZero(vector);

        if (indexFirst == -1 || indexLast == -1){
            return sumOfElem;
        }

        for (int i = indexFirst; i < indexLast; i++){
            sumOfElem += intArray[i];
        }

        return sumOfElem;
    }

    public static int indexOfFirstZero(Vector vector){
        int indexFirst = -1;

        if (vector == null){
            return indexFirst;
        }

        int[] doubleArray = vector.getElements();

        if (doubleArray == null || doubleArray.length < 1){
            return indexFirst;
        }

        for (int i = 0; i < doubleArray.length; i++){
            if (doubleArray[i] == 0){
                return i;
            }
        }
        return indexFirst;
    }

    public static int indexOfLastZero(Vector vector){
        int indexLast = -1;

        if (vector == null){
            return indexLast;
        }

        int[] doubleArray = vector.getElements();

        if (doubleArray == null || doubleArray.length < 1){
            return indexLast;
        }

        for (int i = doubleArray.length - 1; i >= 0; i--){
            if (doubleArray[i] == 0){
                return i;
            }
        }
        return indexLast;
    }
}
