package ra.Interface;

import ra.entity.Employee;

import java.util.List;
import java.util.Scanner;

public interface IEmployee<T, K> {
    // T kaf thực thể đối tuơng employee , k là khóa chính
    List<Employee> getAll();

    // thêm mới 1 nhân viên
    boolean create(T t);


    // 5. Tìm kiếm nhân viên theo tên
    T find_Name(K k);

    T find_ID(K k);

    void inputData(Scanner scanner);

    void displayDate();
}
