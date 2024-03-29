package bai_3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PassedStudentCount {
    public static void main(String[] args) {
        int size;
        float[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new float[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = input.nextFloat();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }

}
