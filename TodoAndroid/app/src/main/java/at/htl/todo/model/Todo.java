package at.htl.todo.model;

public record Todo(
        Long userId,
        Long id,
        String title,
        boolean completed
) { }
