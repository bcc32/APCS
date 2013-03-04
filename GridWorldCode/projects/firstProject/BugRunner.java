/*
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.grid.UnboundedGrid;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(new UnboundedGrid<Actor>());
        Bug redBug = new Bug();
        world.add(redBug);
        System.out.println(redBug.getLocation());
        randomBug(redBug, 1000);
        System.out.println(redBug.getLocation());
        world.add(new Rock());
        world.show();
    }

    private static void moveBug(Bug bug, int n)
    {
        for (int i = 0; i < n; i++)
        {
            while (!bug.canMove())
                bug.turn();
            bug.move();
        }
    }

    private static void randomBug(Bug bug, int n)
    {
        for (int i = 0; i < n; i++)
        {
            double d = Math.random();
            if (d < 0.25)
                bug.setDirection(0);
            else if (d < 0.50)
                bug.setDirection(90);
            else if (d < 0.75)
                bug.setDirection(180);
            else
                bug.setDirection(270);
            moveBug(bug, 1);
        }
    }
}
