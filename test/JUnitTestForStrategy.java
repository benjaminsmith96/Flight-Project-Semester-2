/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Strategy.BronzePointsMultiplier;
import Strategy.GoldPointsMultiplier;
import Strategy.Points;
import Strategy.SilverPointsMultiplier;
import Strategy.StandardPointsMultiplier;
import org.junit.Test;

/**
 *
 * @author Stephen
 */
public class JUnitTestForStrategy {
    
    public JUnitTestForStrategy() {
    }

    @Test
    public void testStrategy(){
    int points = 1;
    Points ctx = new Points();
    ctx.setPointsMultiplierStrategy(new GoldPointsMultiplier());
    ctx.FindCalculatePoints(points);
    ctx.setPointsMultiplierStrategy(new SilverPointsMultiplier());
    ctx.FindCalculatePoints(points);
    ctx.setPointsMultiplierStrategy(new BronzePointsMultiplier());
    ctx.FindCalculatePoints(points);
    ctx.setPointsMultiplierStrategy(new StandardPointsMultiplier());
    ctx.FindCalculatePoints(points);
    }
}
