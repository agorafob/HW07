import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"aaa", "bbb", "ccc", "dddd", "zz", "xxx"};
        String[] test = addIndex(arr, 5, "eee");
        System.out.println(Arrays.toString(test));
        String[]test2 = deleteIndex(arr,3);
        System.out.println(Arrays.toString(test2));
        String test3 = get(arr,2);
        System.out.println(test3);
    }


    public static String[] addIndex(String[] arr, int index, String str) {
        String[] strArr = new String[arr.length + 1];
        int counter = 0;
        if (index >= strArr.length) {
            System.out.println("Wrong input");
            return null;
        } else {
            if (index == 0) {
                strArr[0] = str;
                while (counter < arr.length) {
                    strArr[counter + 1] = arr[counter];
                    counter++;
                }
            } else if (index == strArr.length - 1) {
                strArr[strArr.length - 1] = str;
                while (counter < strArr.length - 1) {
                    strArr[counter] = arr[counter];
                    counter++;
                }
            } else {
                while (counter < index) {
                    strArr[counter] = arr[counter];
                    counter++;
                }
                counter = index;
                while (counter >= index && counter < arr.length) {
                    strArr[counter + 1] = arr[counter];
                    counter++;
                }
                strArr[index] = str;
            }
        }
        return strArr;
    }

    public static String[] deleteIndex(String[] arr, int index) {
        String[] strArr = new String[arr.length - 1];
        int counter = 0;
        if (index >= arr.length) {
            System.out.println("Wrong input");
            return null;
        } else {
            if (index == 0) {
                while (counter < strArr.length) {
                    strArr[counter] = arr[counter + 1];
                    counter++;
                }
            }else if(index==arr.length-1){
                while (counter< arr.length-1){
                    strArr[counter]=arr[counter];
                    counter++;
                }
            }else {
                while (counter < index) {
                    strArr[counter] = arr[counter];
                    counter++;
                }
                counter = index+1;
                while (counter >= index && counter < arr.length) {
                    strArr[counter -1] = arr[counter];
                    counter++;
                }
            }

        }
        return strArr;
    }

    private static String get(String[] arr, int index) {
        String str = null;
        if (index >= arr.length) {
            System.out.println("Wrong input");
        } else {
            str=arr[index];
        }
        return str;
    }

}
