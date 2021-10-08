package com.company;

public class ConfigDados {

    private int level;
    private int numPlayer;
    private int joc;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level > 0 && level < 10) this.level = level;

    }

    public int getNumPlayer() {
        return numPlayer;
    }

    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }

    public ConfigDados() {
        this.level = 1;
        this.numPlayer = 1;
        this.joc = 1;
    }

    public int getJoc() {
        return joc;
    }

    public void setJoc(int joc) {
        if (joc < 4 && joc > 1) ;
        this.joc = joc;
    }
}

