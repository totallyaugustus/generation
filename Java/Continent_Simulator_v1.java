import java.util.Scanner;
public class Main{
    static int random(int min,int max){
        int random_int=(int)Math.floor((Math.random()*(max-min+1))+min);
        return random_int;
    }static String[][] con(String[][] maplist,int x,int y,int cons,int conb,int cone,int conr){
        for(int q=0; q<cons;q++){
            int x1=random(0,x-conb);
            int y1=random(0,y-conb);
            if(random(0,1)==0){
                for(int w=Math.max(0,random(x1-cone-conr,x1-cone+conr));w<Math.min(x,random(x1+conb+cone-conr,x1+conb+cone+conr));w++){
                    for(int e=Math.max(0,random(y1-cone-conr,y1-cone+conr));e<Math.min(y,random(y1+cone-conr,y1+cone+conr));e++){
                        maplist[e][w]="\u25A0";
                    }
                }
            }else{
                for(int w=Math.max(0,random(y1-cone-conr,y1-cone+conr));w<Math.min(y,random(y1+conb+cone-conr,y1+conb+cone+conr));w++){
                    for(int e=Math.max(0,random(x1-cone-conr,x1-cone+conr));e<Math.min(x,random(x1+cone-conr,x1+cone+conr));e++){
                        maplist[e][w]="\u25A0";
                    }
                }
            }
        }return maplist;
    }public static void main(String[] args){
        Scanner i=new Scanner(System.in);
        int x=i.nextInt();
        int y=i.nextInt();
        int cons=i.nextInt();
        int conb=i.nextInt();
        int cone=i.nextInt();
        int conr=i.nextInt();
        String[][] fmaplist=new String[y][x];
        for(int q=0;q<y;q++){
            for(int w=0;w<x;w++){
                fmaplist[q][w]="\u25A1";
            }
        }String[][] maplist=con(fmaplist,x,y,cons,conb,cone,conr);
        for(int q=0;q<y;q++){
            for(int w=0;w<x;w++){
                if(w==x-1){
                    System.out.println(maplist[q][w]);
                }else{
                    System.out.printf(maplist[q][w]);
                }
            }
        }
    }
}
