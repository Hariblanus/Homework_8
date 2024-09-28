package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.phone = "+79999999999";
        post.passport = "1111 №111111";
        post.subscription = true;
        post.birthdate = new FormDate();
        post.birthdate.day = 14;
        post.birthdate.month = 7;
        post.birthdate.year = 1992;
    }
}