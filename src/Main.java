import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //session04-1
        //tạo đối tượng scanner
        Scanner scanner = new Scanner(System.in);
        // Khởi tạo mảng
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Nhập các giá trị cho mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Giá trị thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Sắp xếp mảng bằng thuật toán sắp xếp chọn
        selectionSort(array);

        // Đầu ra
        System.out.println("Mảng đã sắp xếp theo thứ tự giảm dần:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        // Phần tử lớn nhất
        System.out.println("\nPhần tử lớn nhất trong mảng: " + array[0]);

        //session4-2
        //tao đối tượng scanner
        Scanner sc = new Scanner(System.in);
        //Khởi tạo mảng
        System.out.print("Nhập kích thước mảng: ");
        int leaght = sc.nextInt();
        int[] array1 = new int[leaght];
        //nhập các giá trị cho mảng
        System.out.println("Nhập các phẩn tử của mảng: ");
        for (int i = 0; i < leaght; i++) {
            System.out.print("Giá trị thứ "+ (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }
        //thực hện tính tổng các phần tử trong mảng
        int sum = 0;
        for (int value : array1) {
            sum += value;
        }
        System.out.println("Tổng các phần tử trong mảng: " + sum);

        //session4-3
        //tạo đối tượng scanner
        Scanner sc2 = new Scanner(System.in);
        //khởi tạo mảng
        System.out.print("Hãy nhập kích thước của mảng: ");
        int size1 = sc2.nextInt();
        int[] array2 = new int[size1];
        //nhập các giá trị cho mảng
        for (int i = 0; i < size1; i++) {
            System.out.print("Giá trị thứ " + (i + 1) + ": ");
            array2[i] = sc2.nextInt();
        }
        // Sắp xếp mảng bằng thuật toán sắp xếp chọn
        bubbleSort(array2);
        // Đầu ra
        System.out.println("Mảng đã sắp xếp theo thứ tự giảm dần:");
        for (int value : array2) {
            System.out.print(value + " ");
        }
        //session4-4
        //tạo đối tượng scanner
        Scanner sc3 = new Scanner(System.in);
        // Nhập kích thước của mảng
        System.out.print("Nhập kích thước của mảng: ");
        int size2 = scanner.nextInt();

        // Kiểm tra kích thước mảng
        if (size2 <= 0) {
            System.out.println("Kích thước rỗng");
            return;
        }

        int[] array3 = new int[size2];

        // Nhập giá trị cho từng phần tử của mảng
        System.out.println("Nhập các giá trị cho mảng:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Giá trị thứ " + (i + 1) + ": ");
            array3[i] = sc3.nextInt();
        }

        // Hiển thị mảng ban đầu
        System.out.println("Mảng ban đầu:");
        for (int value : array3) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Đảo ngược mảng
        for (int i = 0; i < size2 / 2; i++) {
            // Hoán đổi phần tử
            int temp1 = array3[i];
            array3[i] = array3[size2 - 1 - i];
            array3[size2 - 1 - i] = temp1;
        }

        // Hiển thị mảng sau khi đảo ngược
        System.out.println("Mảng sau khi đảo ngược:");
        for (int value : array3) {
            System.out.print(value + " ");
        }

        //session4-5
        //tạo đôi tượng scanner để nhập dữ liệu
        Scanner sc5 = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập số hàng: ");
        int hang = sc5.nextInt();

        System.out.print("Nhập số cột: ");
        int cot = sc5.nextInt();

        int[][] mang = new int[hang][cot];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                mang[i][j] = sc5.nextInt();
            }
        }

        int tongChan = 0;
        int tongLe = 0;

        // Tính tổng chẵn và tổng lẻ
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (mang[i][j] % 2 == 0) {
                    tongChan += mang[i][j];
                    System.out.println("Tổng các số chẵn: " + tongChan);
                } else {
                    tongLe += mang[i][j];
                    System.out.println("Tổng các số lẻ: " + tongLe);
                }
            }
        }
        //session4-6
        Scanner sc6 = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n6 = sc6.nextInt();

        int[] arr6 = new int[n6];

        // Nhập giá trị cho mảng
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n6; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            arr6[i] = sc6.nextInt();
        }

        // Sắp xếp mảng giảm dần
        selectionSortDescending(arr6);

        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        printArray(arr6);

        // Nhập số cần tìm
        System.out.print("Nhập số cần tìm: ");
        int target = sc6.nextInt();

        // Tìm kiếm tuyến tính
        int indexLinear = linearSearch(arr6, target);
        // Tìm kiếm nhị phân
        int indexBinary = binarySearchDescending(arr6, target);

        // Kết quả tìm kiếm
        if (indexLinear != -1) {
            System.out.println("Tìm kiếm tuyến tính: Số " + target + " được tìm thấy tại vị trí " + indexLinear);
        } else {
            System.out.println("Tìm kiếm tuyến tính: Không tìm thấy số " + target);
        }

        if (indexBinary != -1) {
            System.out.println("Tìm kiếm nhị phân: Số " + target + " được tìm thấy tại vị trí " + indexBinary);
        } else {
            System.out.println("Tìm kiếm nhị phân: Không tìm thấy số " + target);
        }

    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Hoán đổi phần tử lớn nhất với phần tử đầu tiên chưa được sắp xếp
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }
    public static void bubbleSort(int[] array2) {
        int n2 = array2.length;
        boolean swapped;
        for (int i = 0; i < n2 - 1; i++) {
            swapped = false;
            for (int j = 0; j < n2 - i - 1; j++) {
                if (array2[j] < array2[j + 1]) {
                    //hoán dổi array2[j]và array2[j+1]
                    int temp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = temp;
                    swapped = true;
                }
            }
            //nếu không có bất kì hoán đổi nào, array đã được sắp xếp
            if (!swapped) break;
        }

    }
    // Sắp xếp mảng theo thứ tự giảm dần (Selection Sort)
    public static void selectionSortDescending(int[] arr6) {
        int n6 = arr6.length;

        for (int i = 0; i < n6 - 1; i++) {
            int maxIdx = i;

            for (int j = i + 1; j < n6; j++) {
                if (arr6[j] > arr6[maxIdx]) {
                    maxIdx = j;
                }
            }

            // Hoán đổi
            int temp6 = arr6[maxIdx];
            arr6[maxIdx] = arr6[i];
            arr6[i] = temp6;
        }
    }

    // Tìm kiếm tuyến tính
    public static int linearSearch(int[] arr6, int target) {
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Tìm kiếm nhị phân (mảng giảm dần)
    public static int binarySearchDescending(int[] arr6, int target) {
        int left = 0;
        int right = arr6.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr6[mid] == target) {
                return mid;
            } else if (arr6[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    // Hiển thị mảng
    public static void printArray(int[] arr6) {
        for (int num : arr6) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}