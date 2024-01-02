package ra.Interface;

import ra.entity.Bill;
import ra.entity.Employee;

import java.util.List;
import java.util.Scanner;

public interface IBill<T, K> {
    List<Bill> getAll();

    // thêm mới 1 nhân viên
    boolean create(T t);


    // 5. Tìm kiếm nhân viên theo tên

    T find_ID(K k);

    void inputData(Scanner scanner);

    void displayDate();
}
