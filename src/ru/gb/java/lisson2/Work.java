package ru.gb.java.lisson2;

public class Work {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Беляков Иван Михайлович",
                                    "Cварщик",
                                    "belykovIvan@mail.ru",
                                    "8 981 863-65-62",
                                    40000,
                                    18);

        employees[1] = new Employee("Дорожинский Марк Георгивич",
                                    "Кассир",
                                    "king@mail.ru",
                                    "8 951 383-45-67",
                                    30000,
                                    40);

        employees[2] = new Employee("Жданов Даниил Сергеевич",
                                    "Полицейский",
                                    "belov@mail.ru",
                                    "8 981 657-87-23",
                                    60000,
                                    45);

        employees[3] = new Employee("Крюков Егор Алексеевич",
                                    "Програмист",
                                    "general@mail.ru",
                                    "8 954 896-23-54",
                                    100000,
                                    50);

        employees[4] = new Employee("Власов Егор Николаевич",
                                    "Уборщик",
                                    "gekber@mail.ru",
                                    "8 924 324-45-62",
                                    30000,
                                    41);
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i].getAge() > 40)
            {
                employees[i].printInfo();
            }
        }
    }
}
