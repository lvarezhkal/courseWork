public class Main {
    static int idCounter = 0;

    public static void main(String[] args) {
        Employee [] employeeAray = new Employee[10];
        employeeAray[0] = new Employee ("Ivanov Ivan Ivanovich", 2, 88005, idCounter);
        employeeAray[1] = new Employee("Кандакова Александра Эдуардовна", 3, 55353, idCounter);
        employeeAray[2] = new Employee ("Колесников Глеб Вадимович", 1, 50511, idCounter);
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
        int percent = 20;
        System.out.println("Зарплата увеличена на " + percent + "%");
        for (int i = 0; i < employeeAray.length; i++) {
            employeeAray[i].setSalary(employeeAray[i].getSalary() * (100 + percent) / 100);
            System.out.println(employeeAray[i]);
        }

        Employee minSalary2 = employeeAray[0];
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getDepartment() == 2){
                if (employeeAray[i].getSalary() < salary){
                    minSalary2 = employeeAray[i];
                }
                if (salary > employeeAray[i].getSalary()){
                    salary = employeeAray[i].getSalary();
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отеделе - "  + minSalary2);

        Employee maxSalary2 = employeeAray [0];
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getDepartment() == 2){
                if (employeeAray[i].getSalary() > salary){
                    maxSalary2 = employeeAray[i];
                }
                if (salary < employeeAray[i].getSalary()){
                    salary = employeeAray[i].getSalary();
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отеделе - " + maxSalary2);

        int totalSalary2 = 0;
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getDepartment() == 2) {
                totalSalary2 = totalSalary2 + employeeAray[i].getSalary();
            }
        }
        System.out.println("Затраты на зарплату сотрудникам = " + totalSalary2);

        int peopleInTheDepartment = 0;
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getDepartment() == 2) {
                peopleInTheDepartment = peopleInTheDepartment + 1;
            }
        }
        int averageSalary2 = totalSalary2 / peopleInTheDepartment;
        System.out.println("Среднее значение зарплат сотрудников = " + averageSalary2);

        int percent2 = 15;
        System.out.println("Зарплата увеличена на " + percent2 + "%");
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getDepartment() == 2) {
                employeeAray[i].setSalary(employeeAray[i].getSalary() * (100 + percent2) / 100);
                System.out.println(employeeAray[i]);
            }
        }

        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getDepartment() == 2) {
                System.out.println(employeeAray[i].getFullName() + " " + employeeAray[i].getSalary() + " " + employeeAray[i].getId());
            }
        }

        int n = 77777;
        System.out.println("Зарплата выше " + n);
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getSalary() >= n ) {
                System.out.println(employeeAray[i].getFullName() + " " + employeeAray[i].getSalary() + " " + employeeAray[i].getId());
            }
        }
        System.out.println("Зарплата ниже " + n);
        for (int i = 0; i < employeeAray.length; i++) {
            if (employeeAray[i].getSalary() < n) {
                System.out.println(employeeAray[i].getFullName() + " " + employeeAray[i].getSalary() + " " + employeeAray[i].getId());
            }
        }
    }
}