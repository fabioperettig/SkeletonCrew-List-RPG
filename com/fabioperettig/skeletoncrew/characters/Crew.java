package com.fabioperettig.skeletoncrew.characters;

public interface Crew {

    String getName();
    int getLevel();
    int getCost();

    void introduce();
    void goal();
    void cost();
    void attack();
    void earnings();
    void amount();
    void levelUp();
}
