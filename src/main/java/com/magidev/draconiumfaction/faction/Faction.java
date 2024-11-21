package com.magidev.draconiumfaction.faction;

import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

public class Faction
{
    private String name;
    private Set<Player> members;
    private String leader;

    public Faction(String name, Player leader)
    {
        this.name = name;
        this.members = new HashSet<>();
        this.members.add(leader);

        this.leader = leader.getName();
    }

    public void addMember(Player player)
    {
        members.add(player);
    }

    public void removeMember(Player player)
    {
        members.remove(player);
    }

    public boolean isMember(Player player)
    {
        return members.contains(player);
    }

    public String getName()
    {
        return name;
    }

    public String getLeader()
    {
        return leader;
    }

    public void changeLeader(Player newLeader)
    {
        if (members.contains(newLeader))
            this.leader = newLeader.getName();
    }

    public Set<Player> getMembers()
    {
        return new HashSet<>(members);
    }

}
