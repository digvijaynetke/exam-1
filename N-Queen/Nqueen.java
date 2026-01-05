
class Nqueen {
                  public static void main(String[] args) {
                                  System.out.println(nqueen(new boolean[4][4],0));
                      }       

                  static int nqueen(boolean[][] box, int row){
                                    if(row == box.length){
                                        Display(box);
                                        return 1;
                                        }
                                    int count = 0;	
                                    for(int  col = 0 ; col < box[0].length ; col++){
                                        if(check(box,row, col)){
                                            box[row][col] = true;
                                            count += nqueen(box,row+1);
                                            box[row][col] = false;
                                            }
                                        }
                                    return count;
                                    
                                }

                                static boolean check(boolean[][] box , int row, int col){
                                    //up check
                                    for(int i = row ; i >= 0 ; i--){
                                        if(box[i][col] == true){
                                        return false;}
                                    }
                                    
                                    //check leftdiagonal
                                    int Lmax = Math.min(row,col);
                                    for(int i = 1 ; i <= Lmax ; i++){
                                        if(box[row-i][col-i] == true){
                                        return false;
                                        }
                                    }
                                    int Rmax = Math.min(row,box[0].length - col - 1);
                                    for(int i = 1 ; i <= Rmax ; i++){
                                        if(box[row-i][col+i] == true){
                                            return false;
                                            }
                                        }
                                    return true;
                                    }
                                        


                                static void Display(boolean[][] box){
                                    for(int i = 0 ; i < box.length ; i++){
                                        System.out.print("[");
                                        for(int j = 0 ; j < box[0].length ; j++){
                                            if(box[i][j] == true){
                                                System.out.print("Q");
                                                }
                                            else{
                                                System.out.print("X");
                                            }
                                        }
                                        System.out.println("]");
                                    }
                                     System.out.println();
                                }
		

}
