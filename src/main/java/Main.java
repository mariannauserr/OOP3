public class Main {
    private static boolean subscription;

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 444444";
        post.patronymic = "Иванович";
        post.phone = "+7(999)999_9999";
        post.surname = "Иванов";
        subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = String.valueOf(13);
        post.birthday.month = String.valueOf(6);
        post.birthday.year = String.valueOf(1999);
    }

}


