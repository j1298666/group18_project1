package edu.oregonstate.cs361.battleship;

import com.google.gson.annotations.SerializedName;

/**
 * Created by seal on 02/02/2017.
 */
public class Position {
    @SerializedName("Across")
    public int across;
    @SerializedName("Down")
    public int down;

    public Position() {
       this(0, 0);
    }
    public Position(int across, int down) {
        this.across = across;
        this.down = down;
    }
}
