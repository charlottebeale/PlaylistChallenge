package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int a = 0;
        int b = 0;
        for(int i =0; i <= startIndex; i++){
            a++;}
        for(int j = 0; j <= playList.length; j++){
            b++;
        }
        if(a > b){
            return  b;}
        else {
            return a;
        }
    }
}
