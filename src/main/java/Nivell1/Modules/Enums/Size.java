package Nivell1.Modules.Enums;

public enum Size {
    SMALL(28),
    MEDIUM(32),
    FAMILIAR(38);

    public final int cmt;

    private Size(int size) {
        cmt = size;
    }
}

