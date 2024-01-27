public class Main {
    static int idCounter = 0;

    public static void main(String[] args) {
        Employee [] employeeAray = new Employee[10];
        employeeAray[0] = new Employee ("Ivanov Ivan Ivanovich", 2, 88005, idCounter);
        employeeAray[1] = new Employee("Кандакова Александра Эдуардовна", 3, 55353, idCounter);
        employeeAray[2] = new Employee ("Колесников Глеб Вадимович", 1, 32366, idCounter);
        employeeAray[3] = new Employee ("Устинов Михаил Кириллович", 4, 50000, idCounter);
        employeeAray[4] = new Employee ("Гончарова Кира Константиновна", 3, 66600, idCounter);
        employeeAray[5] = new Employee ("Миронов Давид Мирославович", 4, 51488, idCounter);
        employeeAray[6] = new Employee ("Смирнова Дарья Арсентьевна", 2, 22822, idCounter);
        employeeAray[7] = new Employee ("Бочаров Михаил Богданович", 5, 69696, idCounter);
        employeeAray[8] = new Employee ("Березина Вероника Ивановна", 5, 77700, idCounter);
        employeeAray[9] = new Employee ("Левина Таисия Максимовна", 2, 99999, idCounter);

        for (int i = 0; i < employeeAray.length; i++){
            System.out.println(employeeAray[i]);
        }

        int totalSalary = 0;
        for (Employee emp : employeeAray) {
            totalSalary = totalSalary + emp.getSalary();
        }
        System.out.println("Затраты на зарплату сотрудникам = " + totalSalary);

        int salary = employeeAray[0].getSalary();
        Employee minSalary = employeeAray[0];
        for (int i = 0; i <employeeAray.length; i++){
            if (employeeAray[i].getSalary() < salary){
                minSalary = employeeAray[i];
            }
            if (salary > employeeAray[i].getSalary()){
                salary = employeeAray[i].getSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + minSalary);

        Employee maxSalary = employeeAray[0];
        for (int i = 0; i <employeeAray.length; i++){
            if (employeeAray[i].getSalary() > salary){
                maxSalary = employeeAray[i];
            }
            if (salary < employeeAray[i].getSalary()){
                salary = employeeAray[i].getSalary();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + maxSalary);

        int averageSalary = totalSalary / employeeAray.length;
        System.out.println("Среднее значение зарплат сотрудников = " + averageSalary);

        System.out.println("Ф. И. О. всех сотрудников:");
        for (int i = 0; i < employeeAray.length; i++) {
            System.out.println(employeeAray[i].getFullName());
        }
    }
}