import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== СОЗДАНИЕ ЭКЗЕМПЛЯРОВ УНИВЕРСИТЕТСКОЙ СИСТЕМЫ ===\n");

        System.out.println("1. СОТРУДНИКИ:");

        Employee employee = new Employee(100, "Иван Петров", "ivan@university.edu");
        System.out.println("Cотрудник: " + employee);

        AdministrativeStaff admin1 = new AdministrativeStaff(101, "Анна Сидорова", "anna@university.edu");
        System.out.println("Административный сотрудник: " + admin1);

        ResearchStaff researcher1 = new ResearchStaff(102, "Пётр Иванов", "petr@university.edu");
        researcher1.setFieldOfStudy("Компьютерные науки", new ArrayList<>(), new ArrayList<>());
        System.out.println("Научный сотрудник: " + researcher1);

        Lecturer lecturer1 = new Lecturer(103, "Мария Смирнова", "maria@university.edu");
        System.out.println("Преподаватель: " + lecturer1);

        Dean dean1 = new Dean(104, "Сергей Козлов", "sergey@university.edu");
        System.out.println("Декан: " + dean1);

        System.out.println();

        System.out.println("2. КАФЕДРЫ:");
        Institute institute1 = new Institute("Кафедра информатики", "ул. Ленина, д. 1");
        Institute institute2 = new Institute("Кафедра математики", "ул. Пушкина, д. 2");
        System.out.println("Кафедра 1: " + institute1);
        System.out.println("Кафедра 2: " + institute2);

        List<Institute> institutes = new ArrayList<>();
        institutes.add(institute1);
        institutes.add(institute2);

        System.out.println();

        System.out.println("3. УНИВЕРСИТЕТ:");
        University university = new University("Воронежский Государственный Университет", 1500);
        System.out.println("Университет: " + university);

        System.out.println("\n4. ФАКУЛЬТЕТ:");
        Faculty faculty = new Faculty("Факультет компьютерных наук", institutes, university);
        faculty.dean = dean1;
        System.out.println("Факультет: " + faculty);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty);
        university.setFaculties(faculties);

        System.out.println();

        System.out.println("5. КУРСЫ:");
        List<Lecturer> lecturersForCourse = new ArrayList<>();
        lecturersForCourse.add(lecturer1);

        Course course1 = new Course("Программирование на Java", 101, 72, lecturersForCourse);
        Course course2 = new Course("Алгоритмы и структуры данных", 102, 64, lecturersForCourse);
        System.out.println("Курс 1: " + course1);
        System.out.println("Курс 2: " + course2);

        System.out.println();

        System.out.println("6. ПРОЕКТЫ:");

        List<Participation> participations = new ArrayList<>();
        Project project1 = new Project("Искусственный интеллект в образовании",
                new Date(),
                new Date(System.currentTimeMillis() + 86400000L * 180),
                participations);
        System.out.println("Проект: " + project1);

        System.out.println("\n7. УЧАСТИЕ В ПРОЕКТАХ:");
        Participation participation1 = new Participation(120, researcher1, project1);
        System.out.println("Участие: " + participation1);

        participations.add(participation1);

        project1 = new Project(project1.getName(),
                project1.getStart(),
                project1.getEnd(),
                participations);
        System.out.println("Обновленный проект: " + project1);
    }
}
