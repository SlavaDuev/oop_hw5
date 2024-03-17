import java.util.List;

// Класс, представляющий учебную группу
class УчебнаяГруппа {
    private Преподаватель преподаватель;
    private List<Студент> студенты;

    public УчебнаяГруппа(Преподаватель преподаватель, List<Студент> студенты) {
        this.преподаватель = преподаватель;
        this.студенты = студенты;
    }

    // Геттеры и сеттеры для полей класса
    public Преподаватель getПреподаватель() {
        return преподаватель;
    }

    public void setПреподаватель(Преподаватель преподаватель) {
        this.преподаватель = преподаватель;
    }

    public List<Студент> getСтуденты() {
        return студенты;
    }

    public void setСтуденты(List<Студент> студенты) {
        this.студенты = студенты;
    }
}

// Класс, представляющий сервис для работы с учебными группами
class УчебнаяГруппаСервис {
    public УчебнаяГруппа создатьУчебнуюГруппу(Преподаватель преподаватель, List<Студент> студенты) {
        return new УчебнаяГруппа(преподаватель, студенты);
    }
}

// Пример класса Преподаватель
class Преподаватель {
    private int id;
    // Другие поля и методы

    public Преподаватель(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

// Пример класса Студент
class Студент {
    private int id;
    // Другие поля и методы

    public Студент(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

// Пример контроллера
class Контроллер {
    private УчебнаяГруппаСервис учебнаяГруппаСервис;

    public Контроллер(УчебнаяГруппаСервис учебнаяГруппаСервис) {
        this.учебнаяГруппаСервис = учебнаяГруппаСервис;
    }

    public УчебнаяГруппа создатьУчебнуюГруппу(Преподаватель преподаватель, List<Студент> студенты) {
        return учебнаяГруппаСервис.создатьУчебнуюГруппу(преподаватель, студенты);
    }
}
