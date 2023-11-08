package com.github.ivan.kopylove.sandbox.persistence.jpa.fetchvsjoin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 */
@Entity(name = "GAMER")
public class Gamer
{
    @Id
    private int id;

    @Column(name = "NICKNAME")
    private String nickname;

    @ManyToOne
    @JoinColumn(name = "GAME", nullable = false)
    private Game game;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public Game getGame()
    {
        return game;
    }

    public void setGame(Game game)
    {
        this.game = game;
    }
}
