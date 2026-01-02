package ru.yandex.practicum.filmorate.Dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class UserUpdateDto {
    private int id;

    private String email;

    private String login;

    private String name;

    private LocalDate birthday;
}
