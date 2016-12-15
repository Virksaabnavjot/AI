/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessproject;

/**
 *
 * @author Navjot
 */
public class Move{
  Square start;
  Square landing;

  public Move(Square x, Square y){
    start = x;
    landing = y;
  }

  public Move(){
    
  }

  public Square getStart(){
    return start;
  }

  public Square getLanding(){
    return landing;
  }
}