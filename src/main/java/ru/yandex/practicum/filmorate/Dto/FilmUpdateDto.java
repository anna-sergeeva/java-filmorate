package ru.yandex.practicum.filmorate.Dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class FilmUpdateDto {
    private int id;

    private String name;

    private String description;

    private LocalDate releaseDate;

    private int duration;
}