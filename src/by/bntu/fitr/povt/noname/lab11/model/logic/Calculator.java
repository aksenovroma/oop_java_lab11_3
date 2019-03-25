package by.bntu.fitr.povt.noname.lab11.model.logic;

import by.bntu.fitr.povt.noname.lab11.model.entity.Vector;

public class Calculator {
    public static int prodOfEvenElem(Vector vector){
        int prodOfElem = 1;

        if (vector != null && vector.getElements() != null && vector.size() > 0){
            for (int i = 0; i < vector.size(); i += 2){
                prodOfElem *= vector.getElements()[i];
            }
        }
        return prodOfElem;
    }

    public static int sumOfElemBetweenFirstAndLastZero(Vector vector){
        int sumOfElem = 0;

        if (vector != null && vector.getElements() != null && vector.size() > 0){
            int indexFirst = indexOfFirstZero(vector);
            int indexLast = indexOfLastZero(vector);

            if (indexFirst != -1 && indexLast != -1){
                for (int i = indexFirst; i < indexLast; i++){
                    sumOfElem += vector.getElements()[i];
                }
            }
        }
        return sumOfElem;
    }

    public static int indexOfFirstZero(Vector vector){
        if (vector != null && vector.getElements() != null && vector.size() > 0){
            for (int i = 0; i < vector.size(); i++){
                if (vector.getElements()[i] == 0){
                    return i;
                }
            }
        }
        return -1;
    }

    public static int indexOfLastZero(Vector vector){
        if (vector != null && vector.getElements() != null && vector.size() > 0) {
            for (int i = vector.size() - 1; i >= 0; i--){
                if (vector.getElements()[i] == 0){
                    return i;
                }
            }
        }
        return -1;
    }
}
