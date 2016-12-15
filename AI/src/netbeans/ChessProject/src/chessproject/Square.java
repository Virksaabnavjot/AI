package chessproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Navjot
 */
public class Square {
    public int xCoor;
  public int yCoor;
  public String pieceName;

  public Square(int x, int y, String name){
    xCoor = x;
    yCoor = y;
    pieceName = name;
  }

  public Square(int x, int y){
    xCoor = x;
    yCoor = y;
    pieceName = "";
  }

  public int getXC(){
    return xCoor;
  }

  public int getYC(){
    return yCoor;
  }

  public String getName(){
      return pieceName;
  }
}
