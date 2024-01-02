package ra.Interface;

import ra.entity.Bill;
import ra.entity.Bill_Detail;

import java.util.List;
import java.util.Scanner;

public interface IBill_Detail<T, K> {
    // T là thực thể , K là khóa chính
    List<Bill_Detail> getAll();

    // thêm mới 1 nhân viên
    boolean create(T t);


    // 5. Tìm kiếm nhân viên theo tên

    T find_ID(K k);

    void inputData(Scanner scanner);

    void displayDate();
}
